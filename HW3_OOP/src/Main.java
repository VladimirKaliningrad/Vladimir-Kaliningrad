public class Main {
    public static void main (String[] args) {
        VectorList<Integer> vectorList = new VectorList<>();
        vectorList.add(3);
        vectorList.add(6);
        vectorList.add(8);
        vectorList.add(6);
        for(Integer item: vectorList){
            System.out.println(item);
        }

    }
}

