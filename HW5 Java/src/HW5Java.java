/**
 *
 * 1. Создать словарь HashMap. Обобщение <Integer, String>.
 * 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
 * 3. Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
 * 4. *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
 * 5. **Сравнить время прямого и случайного перебора тысячи элементов словарей.*/

package JavaEd_5_Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

 class Homework5 {
    static void addColors(Map<Integer, String> map){
        map.putIfAbsent(1, "white");
        map.putIfAbsent(2, "black");
        map.putIfAbsent(3, "grey");
    }

    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<>();
        addColors(hMap);
        System.out.println(hMap);

        hMap.forEach((k, v) -> hMap.put(k, v + "!"));
        System.out.println(hMap);

        Map<Integer, String> tMap = new TreeMap<>();
        addColors(tMap);
        System.out.println(tMap);

        tMap.forEach((k, v) -> tMap.put(k, v + "!"));
        System.out.println(tMap);

        while (hMap.size() < 1000) {
            int randomInt = new Random().nextInt(2000);
            hMap.putIfAbsent(randomInt, "Simple string");
        }

        while (tMap.size() < 1000) {
            int randomInt = new Random().nextInt(2000);
            tMap.putIfAbsent(randomInt, "String");
        }

        long start = System.currentTimeMillis();
        hMap.forEach((k, v) -> System.out.printf("Key: %d -> Value: %s ", k, v));
        System.out.println();
        System.out.println("HashMap forEach print time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        int count = 0;
        while (count < 1000) {
            int randomInt = new Random().nextInt(2000);
            if (hMap.containsKey(randomInt)) {
                System.out.printf("Key: %d -> Value: %s ", randomInt, hMap.get(randomInt));
                count++;
            }
        }
        System.out.println();
        System.out.println("HashMap random print time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        tMap.forEach((k, v) -> System.out.printf("Key: %d -> Value: %s ", k, v));
        System.out.println();
        System.out.println("TreeMap forEach print time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        count = 0;
        while (count < 1000) {
            int randomInt = new Random().nextInt(2000);
            if (tMap.containsKey(randomInt)) {
                System.out.printf("Key: %d -> Value: %s ", randomInt, tMap.get(randomInt));
                count++;
            }
        }
        System.out.println();
        System.out.println("TreeMap random print time: " + (System.currentTimeMillis() - start));
    }
}