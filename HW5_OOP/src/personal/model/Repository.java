package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void updateUser(User user);

    void deleteUser(String id);

    void saveOldFormat(String fName);

    void saveNewFormat(String fName);
}
