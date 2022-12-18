import Interfaces.Flyable;
import Interfaces.Runable;
import Interfaces.Speakable;

public class Eagle extends Animal implements Speakable, Runable, Flyable {
    public Eagle(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public String toString() {
        return "Eagle " + super.toString();
    }

    @Override
    public int flySpeed() {
        return 100;
    }

    @Override
    public int runSpeed() {
        return 1;
    }

    @Override
    public String speak() {
        return "Eeeeeeee";
    }
}
