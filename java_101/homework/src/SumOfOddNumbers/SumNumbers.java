package SumOfOddNumbers;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        Scanner input = new Scanner(System.in);
        int n = 0, total = 0,x=0,result=0;
        while (!(n < 0)) {
            System.out.println("Sayı giriniz:");
            n = input.nextInt();
            if (n % 2 == 1)
                total += n;
        }
        System.out.println("kullanıcı negatif girene kadar olan tek sayıların toplamı :" +total);


        //homework:
        while (x %2 == 0) {
            System.out.println("Sayı giriniz:");
            x = input.nextInt();
            if (x%4==0)
                result+=x;
        }
        System.out.println("Kullanıcı tek sayı girene kadar 4 ün katı ve çift olan sayıların toplamı:" +result);

    }
}
