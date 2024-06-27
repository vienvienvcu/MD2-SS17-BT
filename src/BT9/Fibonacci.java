package BT9;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) throws Exception {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;
        if(n<0){
            throw new Exception("n phai la mot so nguyen duong");
        }else if(n==1 || n==0){
            return n;
        }else{
            for(int i=2;i<=n;i++){
                f1 = f2;
                f2 = fn;
                fn = f1 + f2;
            }
        }
        return fn;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter n fibonacci number: ");
            try {
                int n = Integer.parseInt(sc.nextLine());
                for (int i = 0 ;i<n;i++){
                    System.out.print(fibonacci(i)+ ",");
                }
                System.out.println();

            }catch (NumberFormatException e){
                System.err.println("must is number >0");
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
    }
}
