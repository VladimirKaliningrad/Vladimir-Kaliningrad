import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    private List<Product> prod_list;

    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("rock", 1)));

    public VendingMachine(List<Product> prod_list) {
        this.prod_list = prod_list;
    }

    public VendingMachine() {
        this(DEFAULT); // вызов конструктора
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        prod_list.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public List<Product> findByName(String name) {
        return finder(p->p.getName().equals(name));
    }

    public List<Product> findByPrice(double price) {
        return finder(p->p.getPrice()==price);
    }

    public List<Product> findByPriceRange(double price1, double price2) {
        return finder(p->p.getPrice()<price2 && p.getPrice()>price1);
    }

    private List finder(Function<Product, Boolean> f){
        List<Product> result = new ArrayList<>();
        prod_list.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;
    }

}