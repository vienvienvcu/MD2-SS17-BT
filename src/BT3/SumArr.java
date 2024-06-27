package BT3;

import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        System.out.println("nhap vao so luong cua mang");

        do {
            try {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int [] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("so phan tu cua mang thu: " + (i+1) );
                    arr[i] = sc.nextInt();
                }

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }

                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }

                System.out.println();
                System.out.println("tong so phan tu trong mang: ");
                System.out.println(sum);

            }catch (Exception e) {
                System.out.println("phai nhap vao mot so nguyen " + e.getMessage());
            }
        }while (true);
    }

}
