package EbobEkok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayı giriniz:");
        int n1 = input.nextInt();
        System.out.println("2. Sayı giriniz:");
        int n2 = input.nextInt();
        int ebob = 0;
        int i = 1;
        if (n1 > n2)
            while (i<=n1) {
                if (n1 % i == 0 && n2 % i == 0)
                    ebob = i;
                i++;
            }
        else
            while (i<=n2) {
                if (n1 % i == 0 && n2 % i == 0)
                    ebob = i;
                i++;
            }
        System.out.println("ebob = " + ebob);
        int ekok = n1 * n2 / ebob;
        System.out.println("ekok = "+ ekok);
    }

}
