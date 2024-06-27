package BT2;

import java.util.Scanner;

public class MaxElement {
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

                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                        break;
                    }
                }
                System.out.println("so phan tu lon nhat cua mang la: ");
                System.out.println(max);
            }catch (Exception e) {
                System.out.println("phai nhap vao mot so nguyen " + e.getMessage());
            }
        }while (true);
    }
}
