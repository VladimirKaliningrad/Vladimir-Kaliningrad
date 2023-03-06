package gb.task.Manager;

import gb.task.Models.Toy;

import java.util.HashMap;

public class ToyManager {

    private HashMap<Integer, Toy> toys = new HashMap<>();

    public ToyManager() {
    }

    public void addToy(int id, String name, int count, double drop_frequency) {
        Toy toy = new Toy(id, name, count, drop_frequency);
        this.toys.put(id, toy);
    }

    public Toy getRandomToy() {
        Toy winnerToy = new Toy();
        for (int i = 1; i <= this.toys.size(); i++) {
            Toy toy = this.toys.get(i);
            if (toy.getDrop_frequency() * 100 >= (Math.random() * 100)) {
                winnerToy = toy;
                this.removeToy(winnerToy.getId());
                break;
            }
        }
        return winnerToy;
    }

    public void removeToy(int id) {
        this.toys.remove(id);
    }

    public void changeDropFrequency(int id, float newValue) {
        this.toys.get(id).setDrop_frequency(newValue);
    }

    public Toy getToyById(int id) {
        return this.toys.get(id);
    }
}
