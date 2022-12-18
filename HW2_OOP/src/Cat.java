import Interfaces.Runable;
import Interfaces.Speakable;

public class Cat extends Animal implements Speakable, Runable {
    public Cat(String name, int legs, String owner) {
        super(name, legs, owner);
    }

    @Override
    public int runSpeed() {
        return 50;
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
