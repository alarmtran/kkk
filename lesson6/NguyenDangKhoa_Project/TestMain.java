package homework.hw1.lesson6.NguyenDangKhoa_Project;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Count the number of occurrences of words in the text--------");
        System.out.print("Option:\n1: Enter using the keyboard.\n2: Read from file.\nYour option: ");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    WordCount.usingEnterFromKeyboard();
                    break;
                case 2:
                    WordCount.usingReadFile();
                    break;
            }
            System.out.println("You want to use the next program :\n1: Yes \n0: No");
            int continueSelect = scanner.nextInt();
            if (continueSelect == 0) {
                break;
            }
        }
    }
}
