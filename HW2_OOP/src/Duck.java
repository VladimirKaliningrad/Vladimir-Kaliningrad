import Interfaces.Flyable;
import Interfaces.Runable;
import Interfaces.Speakable;
import Interfaces.Swimable;

public class Duck extends Animal implements Speakable, Runable, Flyable, Swimable {
    public Duck(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public String toString() {
        return "Duck " + super.toString();
    }

    @Override
    public int flySpeed() {
        return 10;
    }

    @Override
    public int runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Quack";
    }

    @Override
    public int swimSpeed() {
        return 5;
    }
}
