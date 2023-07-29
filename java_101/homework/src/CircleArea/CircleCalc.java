package CircleArea;

import java.util.Scanner;

public class CircleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Dairenin yarı çağını giriniz:");
        double r = input.nextDouble();
        double area = Math.PI * r * r;
        double circumference = Math.PI * r *2;
        System.out.println("Alan = " + area);
        System.out.println("Çevre = " + circumference);

        System.out.println("Merkez açısnı giriniz");
        double a = input.nextDouble();
        double result = (Math.PI *(r*r)*a)/360;
        System.out.println("Daire diliminin alanı:" +result);

    }
}
