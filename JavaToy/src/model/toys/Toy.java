package model.toys;

public abstract class Toy implements Comparable<Toy>, Cloneable {
    private Integer id;
    private String name;
    private Integer count;
    private Integer weight;

    public Toy(Integer id, String name, Integer count, Integer weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getId() {
        return id;
    }

    public void setCount(Integer newCount) {
        this.count = newCount;
    }

    @Override
    public int compareTo(Toy o) {
        return weight.compareTo(o.getWeight());
    }

    @Override
    public Toy clone() throws CloneNotSupportedException {
        return (Toy) super.clone();
    }
}
