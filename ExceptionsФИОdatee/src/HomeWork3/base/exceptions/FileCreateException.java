package HomeWork3.base.exceptions;

import java.io.IOException;

public class FileCreateException extends IOException {
    public FileCreateException(String message) {
        super("File isn't created: " + message);
    }
}
