package model;

public class NoteMapper {
    public Note map(String line) {
        String[] parts = line.split(" / ");
        return new Note(parts[0], parts[1], parts[2], parts[3]);
    }
}
