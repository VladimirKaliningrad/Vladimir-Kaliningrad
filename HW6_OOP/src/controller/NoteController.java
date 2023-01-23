package controller;

import model.Note;
import model.NoteManager;

import java.util.List;

public class NoteController {
    private NoteManager noteManager;

    public NoteController(NoteManager noteManager) {
        this.noteManager = noteManager;
    }

    public void crateNote(String title, String content) {
        noteManager.createNote(title, content);
    }

    public void updateNote(String id, String newTitle, String newContent) {
        noteManager.updateNote(id, newTitle, newContent);
    }

    public void deleteNote(String id) {
        noteManager.deleteNote(id);
    }

    public Note findById(String id) {
        return noteManager.findById(id);
    }

    public List<String> readAllNotes() {
        return noteManager.readAllNotes();
    }
}
