package HomeWork3.base.classes.ui;

import HomeWork3.base.abstractClasses.AGetData;
import HomeWork3.base.exceptions.GetDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class CGetData extends AGetData {
    BufferedReader reader;

    /**
     * Интерфейс консольного ввода.
     */
    public CGetData() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getData() throws IOException {
        String text = """
                Введите данные в произвольном порядке, разделенные пробелом:
                Фамилия Имя Отчество дата рождения номер телефона пол.
                                
                Форматы данных:
                Фамилия, имя, отчество - строки.            
                Дата_рождения - строка формата dd.mm.yyyy.           
                Номер_телефона - целое беззнаковое число без форматирования.
                Пол - символ латиницей f или m.
                
                Например:
                Ivanov Ivan Ivanovich 01.01.1980 12345678901 m 
                """;
        System.out.println(text);
        System.out.print("Введите данные и не тяните время: ");
        String data = "";
        try {
            data = this.reader.readLine();
        }catch (IOException e){
            throw new GetDataException(new IOException());
        }
        return data;
    }
}
