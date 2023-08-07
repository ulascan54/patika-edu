package ExponentCalculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz:");
        int n = input.nextInt();
        System.out.println("Üs olcak sayıyı giriniz:");
        int x = input.nextInt();
        int total = 1;
        for (int i =0 ; i<x; ++i){
            total *= n;
        }

        System.out.println("Cevap:"+total);
    }
}
