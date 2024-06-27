package BT10;

import java.util.Scanner;

public class circleArea {
   public static int circleArea(int radius) throws Exception {
       if (radius <= 0) {
           throw new Exception("radius is number > 0");
       }

       return (int) (3.14*radius * radius);
   }
   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the radius of the circle: ");
       while (true){
           try {
               int radius = Integer.parseInt(sc.nextLine());
                int result = circleArea(radius);
                System.out.println(result);
           }catch (NumberFormatException e){
               System.err.println("Enter a number greater than 0");
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
       }

   }
}
