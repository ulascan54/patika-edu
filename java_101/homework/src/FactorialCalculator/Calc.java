package FactorialCalculator;

import java.util.Scanner;

public class Calc {
    /*
    Java ile faktöriyel hesaplayan program yazıyoruz.

    Ödev
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.

    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();
        int total=1;
        for (int i =1; i<=n;i++){
            total *= i;
        }
        System.out.println(n+"! (Faktöriyel) :"+total);
        //Homework:
        System.out.println(
            """
            Kombinasyon hesaplamak için aşağıdaki formüldeki n sayısını giriniz
            Formül-> C(n,r) = n! / (r! * (n-r)!)
            """);
        int x = input.nextInt();
        System.out.println("r sayısını giriniz");
        int r =input.nextInt();
        int totalr=1,totalx=1,totalnr=1;
        for (int i =1; i<=r;i++){
            totalr *= i;
        }
        for (int i =1; i<=x;i++){
            totalx *= i;
        }
        for (int i =1; i<=(x-r);i++){
            totalnr *= i;
        }
        System.out.println("C(n,r) = "+(totalx/(totalnr*totalr)));

    }

}
