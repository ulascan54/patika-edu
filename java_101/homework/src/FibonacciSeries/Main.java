package FibonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();
        int a = 0,b=1,total=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=0 ; i <n-1; i ++){
            total= a+b;
            a=b;
            b=total;
            System.out.print(total + " ");

        }
    }
}
