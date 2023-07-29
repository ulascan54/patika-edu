package KdvCalculator;

import java.util.Scanner;

public class KdvCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyatı giriniz :");
        float price = input.nextFloat();
        float kdv = (price >0 && price <1000) ? 1.8f : .8f;

        System.out.println("KDV siz Fiyat = " + price);
        System.out.println("KDV dahil Fiyat = " + (price +(price * kdv/10)));
        System.out.println("KDV = " + kdv);

    }

}
