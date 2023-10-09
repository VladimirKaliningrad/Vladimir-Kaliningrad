package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

   // 3.1.
//    @Test
//    public void multipleThreeNotFiveReturnsFizz() {
//        // 3, 6, 9, 33
//        assertEquals("Fizz", someService.fizzBuzz(3));
//    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 33})
    void multipleThreeNotFiveReturnsFizz(int n) {
        assertEquals("Fizz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 55})
    void multipleFiveNotThreeReturnsBuzz(int n) {
        assertEquals("Buzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 225, 3375})
    void multipleThreeAndFiveReturnsFizzBuzz(int n) {
        assertEquals("FizzBuzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 225, 3375})
    void multipleThreeAndFieReturnsFizzBuzz(int n) {
        assertEquals("FizzBuzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 41, 43})
    void notMultipleOfThreeOfFieReturnsNumber(int n) {
        assertEquals(Integer.toString(n), someService.fizzBuzz(n));
    }

    // 3.2.
    @Test
    void first6arrayShouldReturnTrue() {
        assertTrue(someService.firstLast6(new int[]{6, 3, 5, 3}));
    }

    @Test
    void last6arrayShouldReturnTrue() {
        assertTrue(someService.firstLast6(new int[]{2, 345, 6}));
    }

    @Test
    void noLast6arrayShouldReturnFalse() {
        assertFalse(someService.firstLast6(new int[]{2, 345, 2}));
    }

    // 3.3.
    // Недостаточное покрытие
    @Test
    void insufficientCoverageTest(){

        System.out.println(someService.calculatingDiscount(2000, 10));
        assertThat(someService.calculatingDiscount(2000, 50))
                .isEqualTo(1000); // обычная скидка
        assertThat(someService.calculatingDiscount(2000, 100))
                .isEqualTo(0); // обычная скидка
        assertThat(someService.calculatingDiscount(2000, 0))
                .isEqualTo(2000); // обычная скидка


        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть от 0 до 100%"); // процент скидки больше 100%

        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть от 0 до 100%"); // процент скидки меньше 0

        assertThatThrownBy(() ->
                someService.calculatingDiscount(-2000, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка не может быть отрицательной");
    }

    @Test
    void negativePurchaseAmountReturnException() {
        // Отрицательные числа. Сумма покупки
        // Ожидаемый результат: ошибка ArithmeticException с описанием "Сумма покупки не может быть отрицательной"
        assertThatThrownBy(() -> someService.calculatingDiscount(-1000, 50))
                .isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки не может быть отрицательной");

    }

    @Test
    void negativePurchaseDiscountReturnException() {
        // Отрицательные числа. Процент
        // Ожидаемый результат: ошибка ArithmeticException с описанием "Скидка должна быть в диапазоне от 0 до 100%"
        assertThatThrownBy(() -> someService.calculatingDiscount(1000, -10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void discountMore100ReturnException() {
        // Процент > 100
        // Ожидаемый результат: ошибка ArithmeticException с описанием "Скидка должна быть в диапазоне от 0 до 100%"
        assertThatThrownBy(() -> someService.calculatingDiscount(1000, 101))
                .isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void calculatingCorrectDiscount() {
        // Тесты на корректность результата
        // Ожидаемый результат: Метод возвращает верную сумму 1000 - 25%*1000 = 750
        assertThat(someService.calculatingDiscount(1000, 25)).isEqualTo(750);
        assertThat(someService.calculatingDiscount(1000, 100)).isEqualTo(0);
        assertThat(someService.calculatingDiscount(1000, 0)).isEqualTo(1000);
    }

    // 3.4.
    @Test
    void luckySumReturnSumWithout13() {
        assertThat(someService.luckySum(2, 3, 13)).isEqualTo(5);
        assertThat(someService.luckySum(2, 13, 9)).isEqualTo(11);
        assertThat(someService.luckySum(13, 9, 9)).isEqualTo(18);
        assertThat(someService.luckySum(9, 9, 9)).isEqualTo(27);
    }

    @Test
    void evenOddNumber() {
        assertTrue(someService.evenOddNumber(2));
        assertFalse(someService.evenOddNumber(1));
    }

    @Test
    void numberInInterval() {
       assertTrue(someService.numberInInterval(26));
       assertFalse(someService.numberInInterval(1));
    }
}