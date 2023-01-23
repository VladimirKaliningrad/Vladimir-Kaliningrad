package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Saver {

    public void saveNote(Note note, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(note.toString());
            fw.append("\n");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveAllNotes(List<Note> notes, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, false)) {
            for (Note item : notes) {
                fw.write(item.toString());
                fw.append("\n");
            }
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
