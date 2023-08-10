package InvertedTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz :");
        int n = input.nextInt();
        int x=0;
        int a=0;
        for (int i = n; i>=0; i--){
            for (int b = 0; b<a*2; b++)
                System.out.print(" ");
            for (int j = 0; j<=((i*2)-x); j++)
                System.out.print("*");
            System.out.println("");
            a++;
            x+=2;
        }

    }
}
