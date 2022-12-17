public class Product {
    private String name;
    private double price;


    public Product(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return String.format("%s - %.2f",name, price);
    }
}