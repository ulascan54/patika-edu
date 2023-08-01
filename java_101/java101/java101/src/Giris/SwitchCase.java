package Giris;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int deger = 2;
        switch (deger) {
            case 3:
                // değer 3'e eşitse bu kod bloğu çalışacak
                break;
            case 2:
                // değer 2'ye eşitse bu kod bloğu çalışacak
                break;
            default:
                // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
        }

        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        switch (value) {
            case 1:
                // Value 1
                break;
            case 2:
                // Value 1
                break;
            case 3:
                // Value 1
                break;
            default:
                // Value is invalid
                break;
        }

        int gun = 2;
        switch (gun) {
            case 6:
                System.out.println("Bugün cumartesi");
                break;
            case 7:
                System.out.println("Bugün pazar");
                break;
            default:
                System.out.println("Bugün hafta içi");
        }
        // Çıktısı "Bugün hafta içi"
    }
}
