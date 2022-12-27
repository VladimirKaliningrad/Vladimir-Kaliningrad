public class Main {
    public static void main(String[] args) {
        System.out.println("---------first team---------");
        Comandor comandor = new Comandor("Vasia", 250, new LongBow(), new RoundShield());
        Team<Archer> archers = new Team<>(comandor);
        System.out.println(comandor);
        archers.addWarrior(new Archer("Petr", 180, new LongBow(), new Buckler()));
        archers.addWarrior(new Archer("Val", 210, new LongBow(), new Buckler()));
        archers.forEach(item -> System.out.println(item));
        System.out.println("Summary team damage: " + archers.getAllDamage() +
                "summary health: " + archers.getAllHealthPoint() +
                "max range: " + archers.getMaxRadius());
        System.out.println();


        System.out.println("---------second team---------");
        Comandor comandor1 = new Comandor("SuperVasia", 530, new LongBow(), new TowerShield());
        Team<Barbarian> axes = new Team<>(comandor1);
        axes.addWarrior(new Barbarian("Serg", 168, new Sekira(), new TowerShield()));
        System.out.println(comandor1);
        for (Barbarian item : axes) {
            System.out.println(item);
        }
        System.out.println("Summary team damage: " + axes.getAllDamage() +
                "summary health: " + axes.getAllHealthPoint() +
                "max range: " + axes.getMaxRadius());
        System.out.println();
        System.out.println("---------third team---------");
        Comandor comandor2 = new Comandor("Dmitriy", 290, new LongBow(), new RoundShield());
        Team<Warrior> gang = new Team<>(comandor2);
        gang.addWarrior(new Barbarian("John", 325, new Sekira(), new TowerShield()));
        gang.addWarrior(new Archer("Mayk", 187, new LongBow(), new Buckler()));
        System.out.println(comandor2);
        gang.forEach(item -> System.out.println(item));

        System.out.println("Summary team damage: " + gang.getAllDamage() +
                "summary health: " + gang.getAllHealthPoint() +
                "max range: " + gang.getMaxRadius());

    }
}
