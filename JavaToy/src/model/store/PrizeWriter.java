package model.store;

import model.toys.Toy;

import java.io.FileWriter;
import java.io.IOException;

public class PrizeWriter {
    public void writePrize (Toy toy) {
        try (FileWriter writer = new FileWriter("prizes.txt", true)) {
            writer.write(toy.toString());
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
