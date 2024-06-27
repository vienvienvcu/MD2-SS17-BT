package BT14;

import java.util.Scanner;

public class Average {
    public static int AverageArr(int arr[]) throws Exception {
        int s = 0;
        int ave = 0;
        if (arr.length == 0){
            throw new Exception("array is empty");
        }
        for (int i = 0; i <arr.length ; i++){
            s =  s + arr[i];
            ave = s/arr.length;
        }
        return ave;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
     do {
         try {
             int n = Integer.parseInt(sc.nextLine());
             int[] arr = new int[n];
             System.out.println("Enter the elements of the array");
             for (int i = 0; i < n; i++) {
                 arr[i] = Integer.parseInt(sc.nextLine());
             }
             System.out.println(AverageArr(arr));
         }catch (NumberFormatException e){
             System.err.println("Invalid input");
         }catch (Exception e){
             System.err.println(e.getMessage());
         }

     }while (true);

    }
}
