package homework.hw1.lesson5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CheckLookingTypos {

    public static int random() {
        return (int) (Math.random() * (99 - 0) + 0);
    }

    public static int randomv2(int j) {
        return (int) (Math.random() * (34 - j) + j);
    }

    public static ArrayList<Integer> generateRandom() {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        int flag = 0;
        for (int i = 0; i < 8; ) {
            int ranNum = random();
            while (list.contains(ranNum)) {
                ranNum = random();
            }
            list.add(ranNum);
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listRandom = generateRandom();
        listRandom.sort(Comparator.naturalOrder());
        int j = 0;
        int count = 1;
        for (int i = 0; i <= 99; i++) {
            if (j < 8) {
                if (i == listRandom.get(j)) {
                    StringBuilder test = new StringBuilder("I will never spam my friends again. ERROR");
                    if (listRandom.get(j) % 2 != 0) {
                        test.delete(j, randomv2(j));
                    } else {
                        int tesert = listRandom.get(j);
                        test.insert(randomv2(j), (char) random());
                    }
                    System.out.printf("%d.%s\n", count++, test.toString());
                    j++;
                    continue;
                }
            }
            System.out.printf("%d.%s\n", count++, "I will never spam my friends again.");
        }
    }

}
