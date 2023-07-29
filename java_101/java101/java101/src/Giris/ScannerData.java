package Giris;

import java.util.Scanner;

public class ScannerData {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("A sayısını giriniz:");
        a = input.nextInt();// veri tipi neyse nextten sonra onu yazmalıyız
        System.out.println(a);
        double b;
        System.out.println("bir değer gir");
        b = input.nextDouble();
        System.out.println(b);
    }
}
