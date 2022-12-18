import Interfaces.Runable;
import Interfaces.Speakable;

public class Dog extends Animal implements Speakable, Runable {
    public Dog(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }

    @Override
    public int runSpeed() {
        return 45;
    }

    @Override
    public String speak() {
        return "Woof woof";
    }
}
