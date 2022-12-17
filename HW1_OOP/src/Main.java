import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("h2o", 15.3);
        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> goods = new ArrayList<>();
        goods.add(water);
        goods.add(new Product("vine",12));
        goods.add(new Product("dust",10));
        goods.add(new Soda("kind", 19, "grapes"));

        VendingMachine mach2 = new VendingMachine(goods);
        System.out.println(mach2);
        System.out.println(mach2.findByName("kind"));
        System.out.println(mach2.findByPrice(12));
        System.out.println(mach2.findByPriceRange(9,13));

        System.out.println();
        List<Product> milkList = new ArrayList<>();
        milkList.add(new Milk("Parmalat", 20, 3.5));
        milkList.add(new Milk("Prostokvashino", 17, 2.5));
        milkList.add(new Milk("House in the village", 24, 3.2));

        VendingMachine milkMachine = new VendingMachine(milkList);
        System.out.println(milkMachine);
    }
}