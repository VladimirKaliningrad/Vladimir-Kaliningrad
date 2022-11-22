import java.util.Arrays;
import java.util.Random;

public class Lesson1 {
    static int i = 'f'; // int 32, long 64, byte 8, short 16
    public static final int LESSON1_MAX = 12;
    public int age = 67;
    int k=0;

    public static void main(String[] args) {
        char ch = 'd'; // 16 Р±РёС‚ Р±РµР·Р·РЅР°РєРѕРІР°СЏ
        float fl = 4.3486f;
        double d = 44.65;
        boolean b = true;
        boolean[] bArray = new boolean[6];
        i = (int) fl;

        fl /= 0;

        for (int j=0;j<10;j++) {
            i++;
        }

        while (i<=46){
            i=47;
        }

        if (bArray[2]) {
            bArray[2]=false;
        }

        String strOne = "Hello ";
        strOne += "World!";
        strOne.toLowerCase();
        strOne.equals("dfrjy");
        String strTwo = "xdfrhj";
        if (!strOne.equals(strTwo)) {
            System.out.println("strOne "+strOne.equals(strTwo)); //sout
        }
        char[] chOne = new char[256];
        char[] tmp = new char[chOne.length + 5];
        chOne = tmp;

        String.valueOf(b);
        strOne.length();
        strOne.split(" ");
        char char1 = strOne.charAt(5);
        strOne.contains("ewryt");
        strOne.repeat(45);
        "Hello".repeat(5);
        strOne.matches("Ne Hello World!");
        strOne.compareTo("Wo");

        Integer i2 = 4;
        int m = Integer.max(2, 5);
        Integer.bitCount(56);
        Integer.numberOfLeadingZeros(54);
        Integer.toHexString(5);

        int g = (int) 5.67d;
        Math.round(5.67);
        Math.ceil(3.654);

        newMethod(1, 1, "Name");

    }

    private boolean newMethod(int age, double wight, String name){
        //age = this.age;
        int k = 0;
        k = newMethod21(k);
        this.age = age;
        age = 0;
        return true;
    }

    private static int newMethod21(int k){
        return new Random().nextInt(k);
    }

}