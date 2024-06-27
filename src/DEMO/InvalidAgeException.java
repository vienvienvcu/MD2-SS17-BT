package DEMO;

import java.util.Scanner;

public class InvalidAgeException extends Exception {
    public static void main(String[] args) {
        System.out.println(getAge(10));

    }
    public static int getAge(int age) {
        Scanner sc = new Scanner(System.in);
        int checkAge = 0;
        boolean isContinue = true;
        while (isContinue) {
            try {
                System.out.print("Enter your age: ");
                checkAge = Integer.parseInt(sc.nextLine());
                if (checkAge < 0)
                    throw new ArithmeticException("Age must be a positive number >0");
                    break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid age");
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            }

        }
        if (checkAge < 18) {
            System.out.println("You are older than 18 years");
        }
        return checkAge;
    }
}
