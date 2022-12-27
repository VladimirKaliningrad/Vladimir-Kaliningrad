public abstract class Shield implements Blockable {
    private String shieldName;
    private int blockRate;

    @Override
    public int blockDamage() {
        return blockRate;
    }

    public Shield(String shieldName, int blockRate) {
        this.shieldName = shieldName;
        this.blockRate = blockRate;
    }

    @Override
    public String toString() {
        return String.format("Shield: %s block damage: %d", shieldName, blockDamage());
    }
}
