package HomeWork3.base.abstractClasses;

import HomeWork3.base.classes.workWithFile.CFileCreator;
import HomeWork3.base.classes.workWithFile.CFindTheSameFileName;
import HomeWork3.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
