public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
/*
* Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой
строки.

* Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.

* Напишите программу, чтобы перевернуть строку с помощью рекурсии.

* Дано два числа, например 3 и 56, необходимо составить следующие
строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

* Замените символ “=” на слово “равно”.
Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

**Сравнить время выполнения пунка 6 со строкой содержащей 10000
символов "=" средствами String и StringBuilder.
 */
package JavaEd.task2;

        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;

public class task2 {
    public static int count(String str, String targetStr) {
        return (str.length() - str.replace(targetStr, "").length()) / targetStr.length();
    }

    public static String getPoly(String fileName) {
        String str = "";
        try (FileReader fr = new FileReader(fileName)) {
            int c;
            while ((c = fr.read()) != -1) {
                str += (char) c;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return str;
    }

    public static int[] getCoefs(String poly) {
        int[] coefs = new int[(count(poly, "x")) + 1];
        poly = poly.replace(" ", "");
        poly = poly.replace("=0", "");
        poly = poly.replace("*x", "");
        while (poly.contains("^")) {
            StringBuffer sb = new StringBuffer(poly);
            sb.delete(poly.indexOf("^"), poly.indexOf("+", (int) poly.indexOf("^")));
            poly = sb.toString();
        }
        String[] strCoefs = poly.split("\\+");
        for (int i = 0; i < strCoefs.length; i++) {
            coefs[i] = Integer.parseInt(strCoefs[i]);
        }
        return coefs;
    }

    public static int[] sumCoefs(int[] coefs1, int[] coefs2) {
        int[] coefs3 = new int[coefs1.length];
        for (int i = 0; i < coefs3.length; i++) {
            coefs3[i] = coefs1[i] + coefs2[i];
        }
        return coefs3;
    }

    public static String[] getParts(int[] coefs) {
        int k = coefs.length - 1;
        String[] parts = new String[coefs.length];
        for (int i = 0; i < parts.length; i++) {
            if (k - i != 1) {
                parts[i] = String.format("%d*x^%d", coefs[i], k - i);
            } else {
                parts[i] = String.format("%d*x", coefs[i]);
            }
            if (i == parts.length - 1){
                parts[i] = Integer.toString(coefs[i]);
            }
        }
        return parts;
    }

    public static String buildPoly(String[] parts) {
        String poly = "";
        for (int i = 0; i < parts.length; i++) {
            poly = String.join("+", poly, parts[i]);
        }
        return poly.substring(1) + "=0";
    }

    public static void writeResult(String str) {
        try (FileWriter fw = new FileWriter("result.txt", false)) {
            fw.write(str);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String poly1 = getPoly("poly1.txt");
        String poly2 = getPoly("poly2.txt");
        int[] coefs1 = getCoefs(poly1);
        int[] coefs2 = getCoefs(poly2);
        int[] coefs3 = sumCoefs(coefs1, coefs2);
        String[] polyParts = getParts(coefs3);
        String result = buildPoly(polyParts);
        writeResult(result);
    }
}
