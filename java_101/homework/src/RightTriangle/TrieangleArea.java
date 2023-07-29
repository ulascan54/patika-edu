package RightTriangle;

import java.util.Scanner;

public class TrieangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cornerOne,cornerTwo;
        System.out.println("1. Dik kenarı giriniz: ");
        cornerOne = input.nextDouble();

        System.out.println("2. Dik kenarı giriniz: ");
        cornerTwo = input.nextDouble();

        double cornerTree = Math.sqrt((cornerOne*cornerOne) + (cornerTwo* cornerTwo));
        System.out.println("Hipotenüs : " + cornerTree);
        double u = (cornerOne+cornerTwo+cornerTree)/2;
        double area = Math.sqrt(u*(u-cornerOne)*(u-cornerTwo)*(u-cornerTree));

        System.out.println("Alan: "+area);

    }
}
