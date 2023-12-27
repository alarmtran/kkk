package homework.hw1.lesson1;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Bạn muốn nhập vào một :");
            System.out.println("1 : Số nguyên\n2: Số thực\n3: 1 xâu ký tự\n4: 1 mảng");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nhập 1 số nguyên");
                    long num1 = input.nextLong();
                    System.out.println("Số nguyên bạn vừa nhập là " + num1);
                    break;
                case 2:
                    System.out.println("Mời bạn nhập 1 số thực");
                    double num2 = input.nextDouble();
                    System.out.println("Số thực bạn vừa nhập là " + num2);
                    break;
                case 3:
                    System.out.println("Mời bạn nhập 1 xâu");
                    String str = input.nextLine();
                    System.out.println("Xâu bạn vừa nhập là " + str);
                    break;
                case 4:
                    System.out.println("Mời bạn nhập kích thước của mảng");
                    int size = input.nextInt();
                    System.out.println("Mảng của bạn vừa nhập là : ");
                    printArray(inputArray(input, size));
                    break;
                default:
                    System.out.println("Lựa chọn bạn nhập không hợp lệ");
            }
            System.out.println("Bạn có muốn dùng tiếp chương trình : \n 1 : Có \n 0: Không");
            int minichoice = input.nextInt();
            if (minichoice == 0) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static int[] inputArray(Scanner input, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
