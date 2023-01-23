package model;

import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    private NoteMapper noteMapper;
    private Saver saver;
    private NoteBookReader nbReader;
    private String fileName;
    private DateMaker dateMaker;

    public NoteManager(NoteMapper noteMapper, Saver saver, NoteBookReader nbReader, String fileName, DateMaker dateMaker) {
        this.noteMapper = noteMapper;
        this.saver = saver;
        this.nbReader = nbReader;
        this.fileName = fileName;
        this.dateMaker = dateMaker;
    }

    private List<Note> getNotes() {
        List<String> lines = nbReader.readNoteBook(fileName);
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(noteMapper.map(line));
        }
        return notes;
    }

    private int findIndexById(String id, List<Note> notes) {
        int index = 0;
        for (Note note : notes) {
            if (note.getId().equals(id)) {
                index = notes.indexOf(note);
            }
        }
        return index;
    }

    public void createNote(String title, String content) {
        List<Note> notes = getNotes();
        int max = 0;
        for (Note note : notes) {
            int id = Integer.parseInt(note.getId());
            if (id > max) max = id;
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        Note note = new Note(id, title, content, dateMaker.getDate());
        saver.saveNote(note, fileName);
    }

    public void updateNote(String id, String newTitle, String newContent) {
        List<Note> notes = getNotes();
        int targetIndex = findIndexById(id, notes);
        notes.get(targetIndex).setTitle(newTitle);
        notes.get(targetIndex).setContent(newContent);
        notes.get(targetIndex).setDate(dateMaker.getDate());
        saver.saveAllNotes(notes, fileName);
    }

    public void deleteNote(String id) {
        List<Note> notes = getNotes();
        int targetIndex = findIndexById(id, notes);
        notes.remove(targetIndex);
        saver.saveAllNotes(notes, fileName);
    }

    public Note findById(String id) {
        List<Note> notes = getNotes();
        int targetIndex = findIndexById(id, notes);
        return notes.get(targetIndex);
    }

    public List<String> readAllNotes() {
        return nbReader.readNoteBook(fileName);
    }
}
