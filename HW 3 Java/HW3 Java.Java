/**
 *
 *     1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
 *     2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
 *     3. Вставить элемент в список в первой позиции.
 *     4. Извлечь элемент (по указанному индексу) из заданного списка.
 *     5. Обновить определенный элемент списка по заданному индексу.
 *     6. Удалить третий элемент из списка.
 *     7. Поиска элемента в списке по строке.
 *     8. Создать новый список и добавить в него несколько елементов первого списка.
 *     9. Удалить из первого списка все элементы отсутствующие во втором списке.
 *     10. *Сортировка списка.
 *     11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList. */


package JavaEd.Lesson_3_Homework;

import java.sql.SQLOutput;
import java.util.*;

public class Homework3 {
    static List<String> createColorsList() {
        List<String> list = new ArrayList<>();
        list.add("white");
        list.add("black");
        list.add("green");
        list.add("red");
        list.add("brown");
        return list;
    }
    static String addExclamationPoint(String str) {
        str += "!";
        return str;
    }

    static List<String> addToFirstPlace(List<String> list, String str) {
        list.add(0, str);
        return list;
    }

    static String getElementByIndex(List<String> list, int index) {
        return list.get(index);
    }

    static List<String> updateElementByIndex(List<String> list, int index, String str) {
        list.set(index, str);
        return list;
    }

    static void findByString(List<String> list, String str) {
        if (list.contains(str)) {
            System.out.println(String.format("The '%s' has index %d", str, list.indexOf(str)));
        } else{
            System.out.println("Nothing was found");
        }
    }
    public static void main(String[] args) {
        List<String> colorsList = createColorsList();
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        for (int i = 0; i < colorsList.size(); i++) {
            String str = colorsList.get(i);
            colorsList.set(i, addExclamationPoint(str));
        }
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        colorsList = addToFirstPlace(colorsList, "purple");
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        String color2 = getElementByIndex(colorsList, 2);
        System.out.println(color2);
        System.out.println("------------");

        colorsList = updateElementByIndex(colorsList, 4, "yellow");
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        colorsList.remove(2);
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        findByString(colorsList, "brown!");
        System.out.println("------------");

        List<String> colorsList2 = new ArrayList<>();
        colorsList2.add("purple");
        colorsList2.add("white!");
        colorsList2.add("brown!");
        colorsList.retainAll(colorsList2);
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        Collections.sort(colorsList);
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        long start = System.currentTimeMillis();
        List<String> arrList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrList = addToFirstPlace(arrList, "Hello");
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        List<String> linList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linList = addToFirstPlace(linList, "Hello");
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}