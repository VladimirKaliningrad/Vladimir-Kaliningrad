package view;

import controller.NoteController;

import java.util.List;
import java.util.Scanner;

public class NoteView {
    private NoteController noteController;

    public NoteView(NoteController noteController) {
        this.noteController = noteController;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    public void run() {
        Commands com = Commands.NONE;
        while (true) {
            try {
                String command = prompt("Enter command: ");
                if (command.equals("")) throw new RuntimeException("Wrong command!");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case LIST:
                        List<String> notes = noteController.readAllNotes();
                        notes.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case CREATE:
                        String title = prompt("Enter title: ");
                        String content = prompt("Enter content: ");
                        noteController.crateNote(title, content);
                        break;
                    case UPDATE:
                        String id = prompt("Enter ID: ");
                        title = prompt("Enter title: ");
                        content = prompt("Enter content: ");
                        noteController.updateNote(id, title, content);
                        break;
                    case DELETE:
                        id = prompt("Enter ID: ");
                        noteController.deleteNote(id);
                        break;
                    case FIND:
                        id = prompt("Enter ID: ");
                        System.out.println(noteController.findById(id));
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
