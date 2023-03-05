package model.store;

import model.toys.Car;
import model.toys.Doll;
import model.toys.SoftToy;
import model.toys.Toy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ToyStore {
    private ArrayList<Toy> prizes;
    private ArrayList<Toy> toys;
    private PrizeWriter prizeWriter;

    public ToyStore(PrizeWriter prizeWriter) {
        this.prizes = new ArrayList<>();
        this.toys = new ArrayList<>();
        this.prizeWriter = prizeWriter;
    }

    private Integer createId() {
        int max = 0;
        for (Toy toy : toys) {
            if (toy.getId() > max) {
                max = toy.getId();
            }
        }
        return max + 1;
    }

    public void addSoftToy(String name, Integer count, Integer weight) {
        toys.add(new SoftToy(createId(), name, count, weight));
    }

    public void addCar(String name, Integer count, Integer weight) {
        toys.add(new Car(createId(), name, count, weight));
    }

    public void addDoll(String name, Integer count, Integer weight) {
        toys.add(new Doll(createId(), name, count, weight));
    }

    public void decreaseCount(Toy toy) {
        toy.setCount(toy.getCount() - 1);
    }

    public void addToyToPrizesList(Toy toy) throws CloneNotSupportedException {
        Toy prize = toy.clone();
        prize.setCount(1);
        prizes.add(prize);
    }

    public boolean checkToyCount(Toy toy) {
        return toy.getCount() == 0;
    }

    public void removeToyFromToysList(Toy toy) {
        if (checkToyCount(toy)) toys.remove(toy);
    }

    public ArrayList<Toy> getPrizes() {
        return prizes;
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void getRandomPrize() {
        Collections.sort(toys);
        int randInt = (new Random()).nextInt(100);
        for (Toy toy : toys) {
            if (randInt <= toy.getWeight()) {
                try {
                    addToyToPrizesList(toy);
                    decreaseCount(toy);
                    if (checkToyCount(toy)) removeToyFromToysList(toy);
                    return;
                }
                catch (CloneNotSupportedException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
    }

    public void releasePrize() {
        if (!prizes.isEmpty()) {
            prizeWriter.writePrize(prizes.get(0));
            prizes.remove(0);
        }
    }
}
