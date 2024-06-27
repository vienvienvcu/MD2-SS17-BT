package BT8;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a number: ");
                int num = Integer.parseInt(input.nextLine());
                if (num < 2) {
                    throw new Exception("Invalid number, please enter a positive number");
                } else {
                    boolean isPrime = true;
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println("Prime number");
                    } else {
                        System.out.println("Not a prime number");
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Not a number, please enter a number");
            }catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
