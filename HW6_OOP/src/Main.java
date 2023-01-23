import controller.NoteController;
import model.*;
import view.NoteView;

public class Main {
    public static void main(String[] args) {
        DateMaker dateMaker = new DateMaker();
        NoteMapper noteMapper = new NoteMapper();
        Saver saver = new Saver();
        NoteBookReader nbReader = new NoteBookReader();
        String fileName = "notes.txt";
        NoteManager noteManager = new NoteManager(noteMapper, saver, nbReader, fileName, dateMaker);
        NoteController noteController = new NoteController(noteManager);
        NoteView view = new NoteView(noteController);
        view.run();
    }
}
