package Calculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.println("Hesap Makinesi");
        System.out.println("------------------------------------");

        System.out.println("1. Sayıyı giriniz");
        n1 = input.nextInt();

        System.out.println("2. Sayıyı giriniz");
        n2 = input.nextInt();

        System.out.println("-----------------------------------------------------------");
        System.out.println("İşlemler: (Yapılacak işlemi numara ile seçiniz!)");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Cevap:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Cevap:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Cevap:" + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı 0 a bölünemez!");
                        break;
                    default:
                        System.out.println("Cevap:" + (n1 / n2));
                        break;
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız. Tekrar çalıştırın.");
                break;
        }

    }
}
