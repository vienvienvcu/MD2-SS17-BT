package BT12;

import java.util.Scanner;

public class MostGeneral {
    public static int MostGeneralSearch(int num1, int num2) throws Exception {
        if (num1 == 0 && num2 == 0) {
            throw new Exception("ERR");
        }else {
            while (num1 != num2) {
                if (num1 > num2) {
                    num1 = num1 - num2;
                } else {
                    num2 = num2 - num1;
                }
            }
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            int result = MostGeneralSearch(num1, num2);
            System.out.println(result);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
   }


