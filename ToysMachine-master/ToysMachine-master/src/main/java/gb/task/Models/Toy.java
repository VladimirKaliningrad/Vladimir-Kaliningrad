package gb.task.Models;

public class Toy {

    private int id;
    private String name;
    private int count;
    private double drop_frequency;

    public Toy() {}

    public Toy(int id, String name, int count, double drop_frequency) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.drop_frequency = drop_frequency;
    }

    public void setDrop_frequency(float drop_frequency) {
        this.drop_frequency = drop_frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getDrop_frequency() {
        return drop_frequency;
    }
}
