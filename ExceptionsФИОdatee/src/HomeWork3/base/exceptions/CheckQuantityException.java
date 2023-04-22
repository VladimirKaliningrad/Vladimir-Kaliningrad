package HomeWork3.base.exceptions;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException() {
        super("Wrong number of elements in the entered data!");
    }
}
