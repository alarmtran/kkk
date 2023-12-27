package homework.hw1.lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
    public static void reverse(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + "\n");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String flag = "test";
        while (flag.equals("") != true) {
            String item = input.nextLine();
            flag = item;
            list.add(item);
        }
        list.remove(list.size() - 1);
        reverse(list);
    }
}