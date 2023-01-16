package personal.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        writeDown(users);
        return id;
    }

    @Override
    public void updateUser(User user) {
        List<User> users = getAllUsers();
        User target = users.stream().filter(i -> i.getId().equals(user.getId())).findFirst().get();
        target.setFirstName(user.getFirstName());
        target.setLastName(user.getLastName());
        target.setPhone(user.getPhone());
        writeDown(users);
    }

    @Override
    public void deleteUser(String id) {
        List<User> users = getAllUsers();
        int targetIndex = 0;
        for (User user: users) {
            if (user.getId().equals(id)) {
                targetIndex = users.indexOf(user);
            }
        }
        users.remove(targetIndex);
        writeDown(users);
    }

    @Override
    public void saveOldFormat(String fName) {
        List<User> users = getAllUsers();
        List<String> lines = oldFormatLines(users);
        fileOperation.saveFile(lines, fName);
    }

    @Override
    public void saveNewFormat(String fName) {
        List<User> users = getAllUsers();
        List<String> lines = newFormatLines(users);
        fileOperation.saveFile(lines, fName);
    }

    private void writeDown (List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    private List<String> oldFormatLines(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        return lines;
    }

    private List<String> newFormatLines(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.newMap(item));
        }
        return lines;
    }
}
