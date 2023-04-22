package HomeWork3;

import HomeWork3.base.classes.Presenter;
import HomeWork3.base.classes.checkInputData.*;
import HomeWork3.base.classes.parseData.CDataParseProcessor;
import HomeWork3.base.classes.ui.CGetData;
import HomeWork3.base.classes.workWithFile.CFileCreator;
import HomeWork3.base.classes.workWithFile.CFileWriter;
import HomeWork3.base.classes.workWithFile.CFindTheSameFileName;


import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src/HomeWork3/data/";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}
