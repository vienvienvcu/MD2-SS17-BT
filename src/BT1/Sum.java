package BT1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a;
        int b;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the numbe a: ");
                 a = Integer.parseInt(sc.nextLine());
                 if (a<0){
                     System.err.println("phai nhap so >0");
                     break;
                 }
                System.out.println("Enter the number b: ");
                  b = sc.nextInt();
                if (b<0){
                    System.err.println("phai nhap so >0");
                    break;
                }
                int sum = a + b;
                System.out.println("sum = " + sum);
            }catch (Exception e) {
                System.err.println("phai nhap vao so nguyen duong: " + e.getMessage());
            }
        }while (true);

    }



}
