package HW6Java_total;


import java.util.Random;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        SetTreeMap setTreeMap = new SetTreeMap();
        for (int i = 0; i < 10; i++) {
            int randomNum = new Random().nextInt(50);
            setTreeMap.addInt(randomNum);
        }
        System.out.println(setTreeMap);

        IntegerComparator intComp = new IntegerComparator();
        TreeSet<Integer> treeSet = new TreeSet<>(intComp);

        for (int i = 0; i < 10; i++) {
            int randomNum = new Random().nextInt(500);
            treeSet.add(randomNum);
        }
        System.out.println(treeSet);
    }
}