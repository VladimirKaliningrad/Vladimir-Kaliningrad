package HW6Java_total;

import java.util.Map;
import java.util.TreeMap;

public class SetTreeMap {
    private static Map<Integer, Object> map = new TreeMap<>();

    private static final Object PRESENT = new Object();

    public void addInt(int integer) {
        map.put(integer, PRESENT);
    }
    @Override
    public String toString() {
        return map.keySet().toString();
    }
}