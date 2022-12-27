public abstract class Bow implements Weapon{
    public abstract int range();

    @Override
    public String toString() {
        return String.format("Range %d  damage %d",range(),damage());
    }
}
