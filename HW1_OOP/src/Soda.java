public class Soda extends Product{
    public Soda(String name, double price, String flavor) {
        super(name, price);
        this.setFlavor(flavor);
    }
    private String flavor;

    public String getFlavor() {
        return flavor;
    }

    private void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String toString(){
        return String.format("%s - %s", super.toString(), flavor);
    }
}