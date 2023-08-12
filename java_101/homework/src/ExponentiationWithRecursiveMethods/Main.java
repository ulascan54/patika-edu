package ExponentiationWithRecursiveMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("taban giriniz giriniz:");
        int a = input.nextInt();
        System.out.println("üs giriniz giriniz:");
        int b = input.nextInt();
        int result = exponentiationCalculator(a,b);
        System.out.println(result);
    }
    static int exponentiationCalculator(int a,int b){
        if (b!=0)
            return a * exponentiationCalculator(a , (b-1));
        else
            return 1;
    }
}
