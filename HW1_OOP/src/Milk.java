public class Milk extends Product{
    private Double fatContent;

    public Milk(String name, double price, Double fatContent) {
        super(name, price);
        this.fatContent = fatContent;
    }

    public Double getFatContent() {
        return fatContent;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f - %.1f%%", super.getName(), super.getPrice(), this.getFatContent());
    }
}