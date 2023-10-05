package seminars.second.simple_shopping_cart;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    // Создаем набор продуктов для магазина:
    public static List<Product> getStoreItems() {
        List<Product> products = new ArrayList<>();

        // Три массива Названия, Цены, Кол-во
        String[] productNames = {"bacon", "beef", "ham", "salmon", "carrot", "potato", "onion", "apple", "melon", "rice", "eggs", "yogurt"};
        Double[] productPrice = {170.00d, 250.00d, 200.00d, 150.00d, 15.00d, 30.00d, 20.00d, 59.00d, 88.00d, 100.00d, 80.00d, 55.00d};
        Integer[] stock = {10, 10, 10, 10, 10, 10, 10, 70, 13, 30, 40, 60};

        // Последовательно наполняем список продуктами
        for (int i = 0; i < productNames.length; i++) {
            products.add(new Product(i + 1, productNames[i], productPrice[i], stock[i]));
        }

        // тоже самое
        // Product product = new Product(1,"bacon", 170.00d, 10);
        // products.add(product);
        return products;
    }

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private Shop shop;
    private Cart cart;
      @BeforeEach
      void setup() {
          shop = new Shop(getStoreItems());
          cart = new Cart(shop);
      }

/*
            ID | Название  | Цена, р. | Кол-во в магазине, шт.
            1  | bacon     | 170.0    | 10
            2  | beef      | 250.0    | 10
            3  | ham       | 200.0    | 10
            4  | salmon    | 150.0    | 10
            5  | carrot    | 15.0     | 10
            6  | potato    | 30.0     | 10
            7  | onion     | 20.0     | 10
            8  | apple     | 59.0     | 70
            9  | melon     | 88.0     | 13
            10 | rice      | 100.0    | 30
            11 | eggs      | 80.0     | 40
            12 | yogurt    | 55.0     | 60
*/

    /**
     * 2.1. Нужно написать юнит-тест для проверки следующей <b>ситуации</b>:
     * Пользователь положил в корзину несколько продуктов разной стоимости
     * <br><b>Ожидаемый результат:</b>
     * Стоимость корзины посчиталась корректно
     */
    @Test
    void priceCartIsCorrectCalculated() {
        // Arrange (Подготовка)

        // Act (Выполнение)
        cart.addProductToCartByID(1); // 170 +
        cart.addProductToCartByID(2); // 250 +
        cart.addProductToCartByID(3); // 200 = 790
        // Assert (Проверка утверждения)
        assertThat(cart.getTotalPrice()).isEqualTo(620);
    }

    /**
     * 2.2. Нужно написать юнит-тест для проверки следующей <b>ситуации</b>:
     * Пользователь положил в корзину несколько продуктов разной стоимости (несколько продуктов одного вида)
     * <br><b>Ожидаемый результат:</b>
     * Стоимость корзины посчиталась корректно
     */
    @Test
    void priceCartProductsSameTypeIsCorrectCalculated() {
        // Arrange

        // Act
        cart.addProductToCartByID(1); // 170 +
        cart.addProductToCartByID(1); // 170 +
        cart.addProductToCartByID(1); // 170 +
        cart.addProductToCartByID(2); // 250 +
        cart.addProductToCartByID(2); // 250 +
        cart.addProductToCartByID(2); // 250 =
        // Assert
        assertThat(cart.getTotalPrice()).isEqualTo(1260);
    }

    /**
     * 2.3. Нужно написать юнит-тест для проверки следующей <b>ситуации</b>:
     * Пользователь удаляет товар из корзины
     * <br><b>Ожидаемый результат:</b>
     * Вызывается метод пересчета стоимости корзины, стоимость корзины меняется
     */
    @Test
    void whenChangingCartCostRecalculationIsCalled() {
        // Arrange

        // Act
        cart.addProductToCartByID(1); // 170 +
        cart.addProductToCartByID(2); // 250 +
        cart.addProductToCartByID(3); // 200 +
        cart.addProductToCartByID(2); // 250 = 870
        //assertThat(cart.getTotalPrice()).isEqualTo(870);
        cart.removeProductByID(2); // 870 - 250 = 620
        // Assert
        assertThat(cart.getTotalPrice()).isEqualTo(620);
    }

    /**
     * 2.4. Нужно написать юнит-тест для проверки следующей <b>ситуации</b>:
     * Пользователь кладет в корзину продукт в некотором количестве (не весь оставшийся)
     * <br><b>Ожидаемый результат:</b>
     * Количество товара в магазине уменьшается на число продуктов в корзине пользователя
     */
    @Test
    void quantityProductsStoreChanging() {
        // Arrange

        // Act
        cart.addProductToCartByID(1); // 1
        cart.addProductToCartByID(1); // 2
        cart.addProductToCartByID(1); // 3
        cart.addProductToCartByID(1); // 4
        cart.addProductToCartByID(1); // 5
        // Assert
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(5); // index = id - 1
    }

    /**
     * 2.5. Нужно написать юнит-тест для проверки следующей <b>ситуации</b>:
     * Пользователь забрал последние оставшиеся продукты из магазина
     * <br><b>Ожидаемый результат:</b>
     * Больше такой продукт заказать нельзя, он не появляется на полке
     */
    @Test
    void lastProductsDisappearFromStore() {
        // Arrange

        // Act
        cart.addProductToCartByID(1); // 1
        cart.addProductToCartByID(1); // 2
        cart.addProductToCartByID(1); // 3
        cart.addProductToCartByID(1); // 4
        cart.addProductToCartByID(1); // 5
        cart.addProductToCartByID(1); // 6
        cart.addProductToCartByID(1); // 7
        cart.addProductToCartByID(1); // 8
        cart.addProductToCartByID(1); // 9
        cart.addProductToCartByID(1); // 10

        cart.addProductToCartByID(1); // 11  0_0
        // cart.addProductToCartByID(1); // 12

        // Assert
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(10);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(0);
        // 2
        //System.setOut(new PrintStream(output));
        //cart.addProductToCartByID(1);
        //assertEquals("Этого товара нет в наличии", output.toString().trim());
        //System.setOut(null);
    }

    /**
     * 2.6. Нужно написать юнит-тест для проверки следующей <b>ситуации</b>:
     * Пользователь удаляет продукт из корзины
     * <br><b>Ожидаемый результат:</b>
     * Количество продуктов этого типа на складе увеличивается на число удаленных из корзины продуктов
     */
    @Test
    void deletedProductIsReturnedToShop() {
        // Arrange

        // Act
        cart.addProductToCartByID(1); // 1
        cart.addProductToCartByID(1); // 2
        cart.addProductToCartByID(1); // 3
        cart.addProductToCartByID(1); // 4
        cart.addProductToCartByID(1); // 5
        cart.addProductToCartByID(1); // 6
        // Сейчас в корзине должно быть 6 продуктов с id 1(0), в магазине - 4
        //assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(6); // index = id - 1
        //assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(4); // index = id - 1
        cart.removeProductByID(1);
        cart.removeProductByID(1);
        cart.removeProductByID(1); // корзина - 3, магазин - 7
        // Assert
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(3); // index = id - 1
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(7); // index = id - 1
    }

    /**
     * 2.7. Нужно написать юнит-тест для проверки следующей <b>ситуации</b>:
     * Пользователь вводит неверный номер продукта
     * <br><b>Ожидаемый результат:</b>
     * Исключение типа RuntimeException и сообщение Не найден продукт с id
     * *Сделать тест параметризованным
     */
    //@Test
    @ParameterizedTest
    @ValueSource(ints = {-100, 100})
    void incorrectProductSelectionCausesException(int i) {

        // Сначала показать пример в CalculatorTest - expectedIllegalStateExpressionToo - 117

        // Arrange
        int id = i;
        // Act
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            cart.addProductToCartByID(id);
        });
        // Assert
        String expectedMessage = "Не найден продукт с id: " + id;
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    /**
     * 2.8. Нужно написать юнит-тест для проверки следующей <b>ситуации</b>:
     * Пользователь удаляет из корзины больше продуктов чем у него есть в корзине (удаляет продукты до того, как их добавить)
     * <br><b>Ожидаемый результат:</b> Исключение типа NoSuchFieldError и сообщение "В корзине не найден продукт с id"
     */
    @Test
    void incorrectProductRemoveCausesException() {
        // Arrange
        int id = 1;

        // Act
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            cart.removeProductByID(id);
        });

        // Assert
        String expectedMessage = "В корзине не найден продукт с id: " + id;
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    /**
     * 2.9. Нужно восстановить тест
     */
    // boolean Сломанный-Тест() {
    //          // Assert (Проверка утверждения)
    //          assertThat(cart.getTotalPrice()).isEqualTo(cart.getTotalPrice());
    //          // Act (Выполнение)
    //          cart.addProductToCartByID(2); // 250
    //          cart.addProductToCartByID(2); // 250
    //          // Arrange (Подготовка)
    //          Shop shop = new Shop(getStoreItems());
    //          Cart cart = new Cart(shop);
    //      }
    @Test
    void testSUM() {
        // Arrange (Подготовка)

        // Act (Выполнение)
        cart.addProductToCartByID(2); // 250
        cart.addProductToCartByID(2); // 250
        // Assert (Проверка утверждения)
        assertThat(cart.getTotalPrice()).isEqualTo(500);
    }

    /**
     * 2.10. Нужно изменить тест по следующим критериям:
     * <br> 1. Отображаемое имя - "Advanced test for calculating TotalPrice"
     * <br> 2. Тест повторяется 10 раз
     * <br> 3. Установлен таймаут на выполнение теста 70 Миллисекунд (unit = TimeUnit.MILLISECONDS)
     * <br> 4. После проверки работоспособности теста, его нужно выключить
     */
    @DisplayName("Advanced test for calculating TotalPrice")
    @RepeatedTest(10)
    @Timeout(value = 70, unit = TimeUnit.MILLISECONDS)
    @Disabled
    void priceCartIsCorrectCalculatedExt() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        cart.addProductToCartByID(1);
        cart.removeProductByID(1);
        // Assert (Проверка утверждения)
        assertThat(cart.getTotalPrice()).isEqualTo(0);
    }
}