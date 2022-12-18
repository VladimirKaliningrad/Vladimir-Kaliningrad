import Interfaces.Flyable;
import Interfaces.Runable;
import Interfaces.Swimable;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Busya", 4, "Alex"))
                .addAnimal(new Dog("Muhtar", 4, "Andry"))
                .addAnimal(new Duck("Donald", 2, "Ivan"))
                .addAnimal(new Eagle("Red", 2, "Peter"))
                .addAnimal(new Fish("Peper", 0, "Louie"));
        System.out.println(zoo + "\n");
        System.out.println(zoo.talk() + "\n");

        System.out.println("Flyable animals speed: ");
        for (Flyable animal:zoo.getFlyable()) {
            System.out.println(animal.flySpeed());
        }

        System.out.println("Runable animals speed: ");
        for (Runable animal:zoo.getRunable()) {
            System.out.println(animal.runSpeed());
        }
        System.out.println("Champion speed: " + zoo.getChampionSpeed());

        System.out.println("Swimable animals speed: ");
        for (Swimable animal:zoo.getSwimable()) {
            System.out.println(animal.swimSpeed());
        }

        SaveManager saveManager = new SaveManager();
        saveManager.save(zoo.getAnimals());
    }
}