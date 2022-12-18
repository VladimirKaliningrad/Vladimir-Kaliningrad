import Interfaces.Runable;
import Interfaces.Speakable;

public abstract class Animal {
    private String nickname;
    private int legs;
    private String owner;

    public String getNickname() {
        return nickname;
    }

    public int getLegs() {
        return legs;
    }

    public String getOwner() {
        return owner;
    }

    public Animal(String name, int legs, String owner) {
        this.nickname = name;
        this.legs = legs;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("Nickname: %s Owner: %s Legs: %d",
                            this.getNickname(), this.getOwner(), this.getLegs());
    }
}
