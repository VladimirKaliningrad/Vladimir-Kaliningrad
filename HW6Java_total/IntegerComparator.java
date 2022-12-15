package HW6Java_total;
import java.util.Comparator;

public class IntegerComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        return (Integer) o2 - (Integer) o1;
    }
}
