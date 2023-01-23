package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NoteBookReader {
    public List<String> readNoteBook(String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fr);
            String line = buffer.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                line = buffer.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lines;
    }
}
