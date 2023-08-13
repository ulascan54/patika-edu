package PrimeNumberWithRecursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();
        if(isPrimeNumber(n,2))
            System.out.println("Asal sayı");
        else
            System.out.println("Asal değil");
    }

    static boolean isPrimeNumber(int n , int i){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrimeNumber(n, i + 1);
    }
}
