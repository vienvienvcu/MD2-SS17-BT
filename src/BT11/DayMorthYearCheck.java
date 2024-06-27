package BT11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayMorthYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter the  date month year");
        try {
            Date date = sdf.parse(scanner.nextLine());
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(sdf2.format(date));
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
