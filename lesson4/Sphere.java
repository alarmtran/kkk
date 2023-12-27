package homework.hw1.lesson4;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào bán kính và tọa độ tâm của 1 hình cầu theo thứ tự r,a,b,c\n Ta chỉ cần nhập ví dụ 5.6 10.1 11.2 12.3");
            String str1 = input.nextLine();
            str1.trim();
            String[] information1 = str1.split("\\s");
            double r1 = Double.parseDouble(information1[0]);
            double a1 = Double.parseDouble(information1[1]);
            double b1 = Double.parseDouble(information1[2]);
            double c1 = Double.parseDouble(information1[3]);
            System.out.println("Thành công !");
            System.out.println("Bạn muốn làm gì \n 1: Show diện tích xung quanh và thể tích hình cầu vừa nhập vào \n 2 : Nhập thêm 1 hình cầu và check sự bao nhau giao nhau , tiếp xúc ...");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Hình cầu(%.2f,%.2f,%.2f,%.2f)\n",r1,a1,b1,c1);
                    System.out.printf("Diện tích xung quanh là : %.2f \n", 4*Math.PI*r1*r1);
                    System.out.printf("Thể tích là : %.2f \n", (double) 4/3 * Math.PI*r1*r1*r1);
                    break;
                case 2:
                    System.out.println("Nhập vào bán kính và tọa độ tâm của 1 hình cầu khác cách thức tương tự hình cầu cũ"); //5.6 10.1 11.2 12.3
                    String str2 = input.nextLine();
                    str2.trim();
                    String[] information2 = str2.split("\\s");
                    double r2 = Double.parseDouble(information2[0]);
                    double a2 = Double.parseDouble(information2[1]);
                    double b2 = Double.parseDouble(information2[2]);
                    double c2 = Double.parseDouble(information2[3]);
                    System.out.println("Thành công !");
                    double distance = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2) + Math.pow(c2 - c1, 2));
                    double distanceOfR = r1+r2;
                    boolean ngoainhau = false;
                    boolean txngoai = false;
                    boolean catnhau = false;
                    boolean txtrong = false;
                    boolean trongnhau = false;
                    if(distance > distanceOfR){
                        ngoainhau = true;
                    }else if(distance == distanceOfR){
                        txngoai = true;
                    }else if(distance < distanceOfR && distance > Math.abs(r1-r2)){
                        catnhau = true;
                    }else if(distance == Math.abs(r1-r2)){
                        txtrong = true;
                    }else{
                        trongnhau = true;
                    }
                    System.out.printf("Hình cầu 1(%.2f,%.2f,%.2f,%.2f) và Hình cầu 2(%.2f,%.2f,%.2f,%.2f) \n",r1,a1,b1,c1,r2,a2,b2,c2);
                    System.out.println("Ngoài nhau : " + ngoainhau);
                    System.out.println("Tiếp xúc ngoài : " + txngoai);
                    System.out.println("Cắt nhau : " + catnhau);
                    System.out.println("Tiếp xúc trong : " + txtrong);
                    System.out.println("Trong nhau : " + trongnhau);
                    break;
                default:
                    System.out.println("Lựa chọn ko hợp lệ");
                    break;
            }
            System.out.println("Bạn có muốn dùng tiếp chương trình : \n 1 : Có \n 0: Không");
            int minichoice = input.nextInt();
            if (minichoice == 0) {
                break;
            }
        }
    }
}
