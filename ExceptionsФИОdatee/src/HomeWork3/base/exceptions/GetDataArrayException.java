package HomeWork3.base.exceptions;

public class GetDataArrayException extends RuntimeException{
    public GetDataArrayException() {
        super("Data array is null. Before getting the data you need to run the parseData method!!!");
    }
}
