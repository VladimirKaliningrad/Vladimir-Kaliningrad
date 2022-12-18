import Interfaces.Swimable;

public class Fish extends Animal implements Swimable {
    public Fish(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public String toString() {
        return "Fish " + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 5;
    }
}
