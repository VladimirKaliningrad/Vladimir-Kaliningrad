public class Archer extends Warrior<Bow, Buckler> {
    public Archer(String name, int healthpoint, Bow bow, Buckler buckler) {
        super(name, healthpoint, bow, buckler);
    }

    @Override
    public String toString() {
        return "Archer: " + super.toString();
    }
}
