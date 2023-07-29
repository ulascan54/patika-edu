package BodyMassIndexCalculation;

import java.util.Scanner;

public class BodyMassIndexCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg,l;
        System.out.println("Kilonuzu giriniz");
        kg = input.nextDouble();

        System.out.println("Boyunuzu giriniz");
        l = input.nextDouble();

        double result = kg/(l*l);

        System.out.println("Vucut Kitle Indeksiniz: " +result);
    }
}
