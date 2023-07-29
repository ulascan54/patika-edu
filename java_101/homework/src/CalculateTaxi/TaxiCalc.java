package CalculateTaxi;

import java.util.Scanner;

public class TaxiCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initalValue = 10.0;
        double priceForEachKm= 2.20;
        double total, km;
        System.out.println("Kaç km yol aldınız girinis :");
        km= input.nextDouble();
        total = initalValue + priceForEachKm*km;
        System.out.println("Ödenecek Tutar:" +(total<20 ? 20 : total) + "TL dir \n Yine bekleriz...");
    }
}
