package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Enter command: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;
            try {
                switch (com) {
                    case CREATE:
                        String firstName = prompt("First name: ");
                        String lastName = prompt("Last name: ");
                        String phone = prompt("Phone number: ");
                        userController.saveUser(new User(firstName, lastName, phone));
                        break;
                    case READ:
                        String id = prompt("ID: ");
                        User user = userController.readUser(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        List<User> lst = userController.readList();
                        lst.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case UPDATE:
                        String numId = prompt("Input ID of contact to update: ");
                        userController.idPresenceValidation(numId);
                        userController.updateUser(numId, createAGuy());
                        break;
                    case DELETE:
                        String delId = prompt("Input ID of contact to delete: ");
                        userController.idPresenceValidation(delId);
                        userController.deleteUser(delId);
                        break;
                    case SAVE:
                        String choice = prompt("Choose a save format (old / new): ");
                        userController.formatChoiceValidation(choice);
                        String fName = prompt("Enter name for save file (without file extension): ") + ".txt";
                        userController.saveFile(choice, fName);
                        break;

                }
            } catch (Exception e) {
                System.out.println("Oopsie!\n"+ e.getMessage());
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createAGuy() {
        String firstName = prompt("First name: ");
        String lastName = prompt("Last name: ");
        String phone = prompt("Phone number: ");
        User newGuy = new User(firstName, lastName, phone);
        return newGuy;
    }
}
