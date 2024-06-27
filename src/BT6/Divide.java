package BT6;

import java.util.Scanner;

public class Divide {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number a");
            int a = sc.nextInt();
            System.out.println("Enter the number b");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
            if (a == 0 || b == 0) {
                throw new Exception("Divide by zero");
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
