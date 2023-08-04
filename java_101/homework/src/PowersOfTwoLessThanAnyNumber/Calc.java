package PowersOfTwoLessThanAnyNumber;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        /*
        Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Ödev
        Java  döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();
        System.out.println("Girilen sayıya kadar 2 nin kuvvetleri:");
        for (int i = 1; i <= n; i *= 2) {
            if (i == 1)
                continue;
            System.out.print(i+",");
        }
        System.out.println("\n--------------------------------------------");

        //homework:
        System.out.println("Sayı giriniz:");
        System.out.println("Girilen sayıya kadar 4 nin kuvvetleri:");
        int x = input.nextInt();
        for (int j = 1; j<=x;j*=4){
            if (j == 1)
                continue;
            System.out.print(j+",");
        }
        System.out.println("\n--------------------------------------------");
        System.out.println("Girilen sayıya kadar 5 nin kuvvetleri:");
        for (int z = 1; z<=x;z*=5){
            if (z == 1)
                continue;
            System.out.print(z+",");
        }
    }
}
