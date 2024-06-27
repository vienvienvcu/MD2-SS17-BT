package BT7;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter the number fist");
                int numberFirst = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the number last");
                int numberLast = Integer.parseInt(sc.nextLine());

                if (numberFirst <= 0 || numberLast <= 0) {
                    throw new Exception("number >=0");
                }
                if (numberFirst > numberLast) {
                    System.out.println(numberFirst + " is greater than " + numberLast);
                } else if (numberFirst < numberLast) {
                    System.out.println(numberFirst + " is less than " + numberLast);
                }
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
