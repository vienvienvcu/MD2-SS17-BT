package BT15;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        while(true){
            scanner = new Scanner(System.in);
            System.out.println("Nhap vao so nguyen a: ");
            try{
                a = Integer.parseInt(scanner.nextLine());
                if(a<1)
                    System.out.println("Phai nhap vao so nguyen duong");
                else
                    break;
            }catch (Exception ex){
                System.out.println("Phai nhap vao la so");
            }

        }

        while(true){
            scanner = new Scanner(System.in);
            System.out.println("Nhap vao so nguyen b: ");
            try{
                b = Integer.parseInt(scanner.nextLine());
                if(b<1)
                    System.out.println("Phai nhap vao so nguyen duong");
                else
                    break;
            }catch (Exception ex){
                System.out.println("Phai nhap vao la so");
            }

        }

        while(true){
            scanner = new Scanner(System.in);
            System.out.println("Nhap vao so nguyen c: ");
            try{
                c = Integer.parseInt(scanner.nextLine());
                if(c<1)
                    System.out.println("Phai nhap vao so nguyen duong");
                else
                    break;
            }catch (Exception ex){
                System.out.println("Phai nhap vao la so");
            }
        }

        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("Day la 3 canh cua tam giac");
        }else
            throw new IllegalTriangleException("Khong phai 3 canh cua tam giac");

        int perimeter = a+b+c;
        double halfOfPerimeter = (double)perimeter/2;
        double area = Math.sqrt(halfOfPerimeter*(halfOfPerimeter-a)*(halfOfPerimeter-b)*(halfOfPerimeter-c));
        System.out.println("Chu vi tam giac: "+perimeter);
        System.out.printf("Dien tich tam giac: %.2f",area);
        System.out.println();
    }
}
