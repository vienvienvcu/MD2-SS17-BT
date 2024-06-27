package BT5;

import java.util.Scanner;

public class SerchBinary {

    public static int binarySearch(int[] arr, int key) throws Exception {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        throw new Exception("khong tin thay vi tri");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array");
            int n = Integer.parseInt(sc.nextLine());
            int [] arr = new int[n];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println("phan tu mang la : " + arr[i]);
            }
            System.out.println("Enter the elements of the array");
            int key = sc.nextInt();
            int index = binarySearch(arr, key);
            System.out.println(key + " được tìm thấy tại chỉ số " + index + " trong mảng.");
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
