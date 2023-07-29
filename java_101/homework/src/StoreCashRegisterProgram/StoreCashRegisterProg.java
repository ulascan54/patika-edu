package StoreCashRegisterProgram;

import java.util.Scanner;

public class StoreCashRegisterProg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutPrice, armutKg, elmaPrice, elmaKg, domatesPrice, domatesKg, muzPrice, muzKg, patlicanPrice, patlicanKg;

        armutPrice = 2.14;
        elmaPrice=3.67;
        domatesPrice=1.11;
        muzPrice=0.95;
        patlicanPrice=5.00;

        System.out.println("Armut kaç kg ? :");
        armutKg = input.nextDouble();

        System.out.println("Elma kaç kg ? :");
        elmaKg = input.nextDouble();

        System.out.println("Domates kaç kg ? :");
        domatesKg = input.nextDouble();

        System.out.println("Muz kaç kg ? :");
        muzKg = input.nextDouble();

        System.out.println("Patlıcan kaç kg ? :");
        patlicanKg = input.nextDouble();


        double result = (armutPrice*armutKg) + (elmaPrice*elmaKg)+ (domatesPrice*domatesKg) + (muzPrice*muzKg) + (patlicanPrice * patlicanKg);

        System.out.println(String.format("Ödeyeceğiniz Tutar: %.3f TL", result));
    }

}
