import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();
    private Comandor comandor;

    public Team(Comandor comandor) {

        this.comandor = comandor;
    }

    public Comandor getComandor() {
        return comandor;
    }

    public void addWarrior(T newwarrior) {
        warriors.add(newwarrior);

    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage() {
        int sumDamage = 0;
        for (T item : warriors) {
            sumDamage += item.getWeapon().damage();

        }
        return sumDamage;
    }

    public int getAllHealthPoint() {
        int health = 0;
        for (T item : this) {
            health += item.getHealthpoint();

        }
        return health;
    }

    public int getMaxRadius() {
        int maxRange = 0;
        for (T item : this) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if (maxRange < bow.range()) {
                    maxRange = bow.range();
                }
            }
        }
        return maxRange;
    }
}