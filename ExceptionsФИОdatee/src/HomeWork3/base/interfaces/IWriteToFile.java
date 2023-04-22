package HomeWork3.base.interfaces;

import HomeWork3.base.exceptions.MyFileCreateException;
import HomeWork3.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
