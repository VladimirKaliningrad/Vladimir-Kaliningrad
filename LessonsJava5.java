import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class LessonsJava5 {

    public static void main (String[] args){

        Map<Integer, String> map = HashMap<>();
        Set<Integer> keySet = map.keySet();

        map.put(k:5, v: "Five");
        String str = map.get(32);
        if (map.get(32) != null) System.out.println (str);
        map.containsKey (o:32);
        map.containsValue (o: "Five");
        Set<Map.Entry<Integer, String>> eSet = map.entrySet();
        map.remove (o:4);
        map.replace (5, "Piat");
        map.replace (key: 5, oldValue: "Five", newValue "5");
        map.size();
        map.forEach((k, v) => System.out.println ("key: "+ k + "val:" + v));

        map.merge (key: 7, value "GH", (k , v ->=v+ "!")); //обьединяет строки




    }

}