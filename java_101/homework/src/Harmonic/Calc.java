package Harmonic;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();
        double total = 0;
        for (int i = 1; i<=n; i++ ){
            total += (double)1/i;
        }
        System.out.println("Cevap: "+total);
    }
}
