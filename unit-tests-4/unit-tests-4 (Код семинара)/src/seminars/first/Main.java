package seminars.first;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.*; // Импортируем классы библиотеки assertJ

public class Main {

    // Типы ошибок. Синтаксические
//    public static void main(String[] args) {
//        System.out.println("Hello world!")
//    }

    // Типы ошибок. ?
//    public static void main(String[] args) {
//        compareNumbers(2, 2); // Вызывается метод сравнения двух чисел
//    }
//    private static void compareNumbers(int a, int b) {
//        if (a > b) {
//            System.out.printf("%d more than %d", a, b);
//        }
//        if (a <= b) {  // Допущена ошибка -знак <= вместо <
//            System.out.printf("%d less than %d", a, b);
//        }
//    }

    // Типы ошибок. ?
//  public static void main(String[] args) {
//      int a = 10, b = 0;
//      System.out.printf("Result: %d", a / b);
//  }

    public static void main(String[] args) {
        // assertConditionA();

        // assertConditionB();

        // System.out.println(sum(2_147_483_647, 2));

        // happyNY();

        // expectedValue();

        // checkingShoppingCart();

        // String[] colors = {"...", "...",};

        // testingJavaCollectionsAssertJ(colors);

        // List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        // Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);
        // checkingCreationOfHero(emmett);
    }

    //                  Практические задания:
    // 1.1
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    // 1.2
    public static void assertConditionB() {
        int x = -1;
        assert x >= 0;
    }

    // 1.3
    // assert boolean_выражение : сообщение_об_ошибке;
    // Ariane V - https://habr.com/ru/company/pvs-studio/blog/306748/
    // sum(2_147_483_647, 1) возвращает "-2147483648"
    public static int sum(int a, int b) {
        assert (Integer.MAX_VALUE - a >= b) : "Значение выражения вышло за пределы переменной";
        return a + b;
    }

    // 1.4
    // 08/12/2022 06:19:41
    // windows fail - https://habr.com/ru/company/pvs-studio/blog/698404/
    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentDateTime = dateFormat.format(calendar.getTime());

        // Получили строку currentDateTime в формате "09/12/2022 20:20:04"

        assert currentDateTime.equals("01/01/2023 00:00:00") : "Еще 2022 год :(";
        System.out.println("С новым годом!");
    }

    // 1.5
    // выражение assert верно, нужно исправить код
    // Вот наиболее распространенный вариант использования. Предположим, вы включаете значение enum:
    public static void checkingShoppingCart() {
        ArrayList<String> productCategories = new ArrayList<>();
        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");

        ArrayList<String> products = new ArrayList<>();
        products.add("apple");
        products.add("tomato");
        products.add("bread");
        products.add("water");

        for (String product : products) {
            if (product.equals("apple")) {
                System.out.println("category: " + productCategories.get(0));
            } else if (product.equals("tomato")) {
                System.out.println("category: " + productCategories.get(1));
            } else if (product.equals("bread")) {
                System.out.println("category: " + productCategories.get(2));
            } else {
                assert false : "Unknown category for the product " + product;
            }
        }
    }

    // 1.6
    //   AssertJ
    // ok - assertThat(actual).isEqualTo(expected);
    // not ok - assertThat("expected").isEqualTo("actual");
    public static void expectedValue() {
        assertThat(5).isEqualTo(sum(2, 3));
    }

    // 1.7
    public static void testingJavaCollectionsAssertJ(String[] colors) {
        assertThat(colors)
                .isNotEmpty()
                .hasSize(7)
                .doesNotHaveDuplicates()
                .contains("orange", "green", "violet")
                .endsWith("gold")
                .startsWith("aqua")
                .containsSequence("yellow", "blue")
                .doesNotContain("red", "black");
    }

    // 1.8
    public static void checkingHero() {

        // List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        // Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);

        /*
        1. Проверить, что герой создался с именем Emmett
        2. Проверить, что значение прочности брони героя равно 50
        3. Проверить, что у героя оружие типа sword
        4. Проверить содержимое инвентаря героя (не пустой, размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)
        5. Проверить, что герой человек (свойство true)
        */
    }

    // Черный ящик
    static class Hero {
        private String name;
        private int armorStrength;
        private String weapon;
        private List<String> bag;
        private boolean isHuman;

        public Hero(String name, int armorStrength, String weapon, List<String> bag, boolean isHuman) {
            this.name = name;
            this.armorStrength = armorStrength;
            this.weapon = weapon;
            this.bag = bag;
            this.isHuman = isHuman;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getArmorStrength() {
            return armorStrength;
        }

        public void setArmorStrength(int armorStrength) {
            this.armorStrength = armorStrength;
        }

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public List<String> getBag() {
            return bag;
        }

        public void setBag(List<String> bag) {
            this.bag = bag;
        }

        public boolean isHuman() {
            return isHuman;
        }

        public void setHuman(boolean human) {
            isHuman = human;
        }
    }
}