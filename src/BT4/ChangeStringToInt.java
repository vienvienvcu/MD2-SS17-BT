package BT4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeStringToInt {
    public static void main(String[] args) {
        System.out.println("input is string");
        List <Integer> list = new ArrayList<>();
        String str = null;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        String [] strArr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            try {
                list.add(Integer.parseInt(strArr[i]));
            } catch (Exception e) {
                list.add(0);
                System.err.println(e.getMessage());
            }
        }
        System.out.println(list);
    }
}
