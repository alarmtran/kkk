package homework.hw1.lesson2;

import java.util.Scanner;

public class ActionWithArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Tiếp theo bạn muốn làm gì \n1: In ra số hoàn hảo trong mảng \n2: In ra số nguyên tố trong mảng \n3: Test generic ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nhập kích thước của mảng");
                    int size = input.nextInt();
                    System.out.println("Mời bạn nhập mảng ");
                    findPerfectNum(inputArray(input, size));
                    break;
                case 2:
                    System.out.println("Mời bạn nhập kích thước của mảng");
                    int size2 = input.nextInt();
                    System.out.println("Mời bạn nhập mảng ");
                    printPrimeNumber(inputArray(input, size2));
                    break;
                case 3:
                    System.out.println("Mời bạn nhập kích thước của mảng");
                    int size3 = input.nextInt();
                    System.out.println("Mời bạn nhập vào mảng số thực của bạn");
                    Double[] arr = inputRealNumberArray(input, size3);
                    System.out.println("Mảng của bạn là : ");
                    printElement(arr);
            }
            System.out.println("Bạn có muốn dùng tiếp chương trình : \n 1 : Có \n 0: Không");
            int minichoice = input.nextInt();
            if (minichoice == 0) {
                break;
            }
        }
    }

    //Sử dụng Generic

    public static <T> void printElement(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Số hoàn hảo
    public static void findPerfectNum(int[] arr) {
        for (int element : arr) {
            if (perfectNum(element)) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static boolean perfectNum(int num) {
        int sum = 1;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            int num1 = i;
            int num2 = num / i;
            if (num % num1 == 0) {
                if (num1 == num2) {
                    sum += num1;
                } else {
                    sum += (num1 + num2);
                }
            }
        }
        if (sum == num) return true;
        return false;
    }

    //Tự đặt thêm 1 điều kiện
    public static void printPrimeNumber(int[] arr) {
        for (int element : arr) {
            if (element == 2 || element == 3) {
                System.out.print(element + " ");
            } else if (element > 3) {
                boolean check = false;
                for (int i = 2; i * i <= element; i++) {
                    if (element % i == 0) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.print(element + " ");
                }
            }
        }
        System.out.println();
    }

    //Tool chung
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

    public static Double[] inputRealNumberArray(Scanner input, int size) {
        Double[] arr = new Double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextDouble();
        }
        return arr;
    }
    public static int[] generateArray(){
        int[] list = new int[1000000];
        for(int i=0;i<1000000;i++){
            list[i] = (int) (Math.random()*(1000000-1+1)+1);
        }
        return list;
    }

}
