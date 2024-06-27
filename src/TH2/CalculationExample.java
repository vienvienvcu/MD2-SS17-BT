package TH2;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculator(x,y);

    }
    private void calculator(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x % y;
            System.out.println("thong cua x + y la: " + a);
            System.out.println("hieu cua x - y la: " + b);
            System.out.println("tich cua y * y la: " + c);
            System.out.println("chia cua x / y la: " + d);

        }catch (Exception e) {
            System.err.println("xay ra ngoai le: " + e.getMessage());
        }
    }
}
