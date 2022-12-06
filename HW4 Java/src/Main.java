import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Homework4 {
    public static void main(String[] args) {
        List<String> listFirstName = new ArrayList<>();
        List<String> listSecondName = new ArrayList<>();
        List<String> listLastName = new ArrayList<>();
        List<Integer> listAge = new ArrayList<>();
        List<Boolean> listGender = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            Scanner scannerName = new Scanner(System.in);
            Scanner scannerAge = new Scanner(System.in);
            Scanner scannerGender = new Scanner(System.in);
            Scanner scannerChoice = new Scanner(System.in);

            System.out.println("Enter full name");
            String name = scannerName.nextLine();
            String[] arrName = name.split(" ");
            if (arrName.length == 3){
                listFirstName.add(arrName[0]);
                listSecondName.add(arrName[1]);
                listLastName.add(arrName[2]);
            } else if (arrName.length == 2) {
                listFirstName.add(arrName[0]);
                listSecondName.add("");
                listLastName.add(arrName[1]);
            } else if (arrName.length == 1) {
                listFirstName.add(arrName[0]);
            }

            System.out.println("Enter age");
            int age = scannerAge.nextInt();
            listAge.add(age);

            System.out.println("Enter gender (M / F)");
            String gender = scannerGender.nextLine().toLowerCase();
            if (gender.equals("m")) {
                listGender.add(true);
            } else listGender.add(false);

            System.out.println("Add another person? Y / N");
            String choice = scannerChoice.nextLine().toLowerCase();
            if (choice.equals("n")) {
                flag = false;
            }
        }

        for (int i = 0; i < listAge.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listAge.size(); j++) {
                if (listAge.get(j) < listAge.get(minIndex)) minIndex = j;
            }
            int temp = listAge.get(i);
            listAge.set(i, listAge.get(minIndex));
            listAge.set(minIndex, temp);

            String temp2 = listFirstName.get(i);
            listFirstName.set(i, listFirstName.get(minIndex));
            listFirstName.set(minIndex, temp2);

            temp2 = listSecondName.get(i);
            listSecondName.set(i, listSecondName.get(minIndex));
            listSecondName.set(minIndex, temp2);

            temp2 = listLastName.get(i);
            listLastName.set(i, listLastName.get(minIndex));
            listLastName.set(minIndex, temp2);

            boolean temp3 = listGender.get(i);
            listGender.set(i, listGender.get(minIndex));
            listGender.set(minIndex, temp3);
        }
        for (int i = 0; i < listAge.size(); i++) {
            System.out.printf("%s %s %s %d %s%n",
                    listFirstName.get(i), listSecondName.get(i), listLastName.get(i), listAge.get(i),
                    (listGender.get(i) ? "Male":"Female"));
        }
    }
}