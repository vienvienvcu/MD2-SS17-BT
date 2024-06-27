package BT13;

import java.util.Scanner;

public class StringReversal {
    public static String reverseInputString(String myString) throws Exception {
        if(myString == null || myString.length() == 0){
            throw new Exception("String is empty");
        }
        String reverseString = "";
        for (int i = myString.length() - 1; i >= 0; i--){
            reverseString += myString.charAt(i);
        }
        return reverseString;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
            try {
                String myString = sc.nextLine();
                System.out.println(reverseInputString(myString));
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
    }
}
