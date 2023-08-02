package ChineseZodiac;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Doğum yılınızı giriniz :");
        age = input.nextInt();
        switch (age%12){
            case 0 -> System.out.println("Çin Zodyağı Burcunuz : Maymun");
            case 1 -> System.out.println("Çin Zodyağı Burcunuz : Horoz");
            case 2 -> System.out.println("Çin Zodyağı Burcunuz : Köpek");
            case 3 -> System.out.println("Çin Zodyağı Burcunuz : Domuz");
            case 4 -> System.out.println("Çin Zodyağı Burcunuz : Fare");
            case 5 -> System.out.println("Çin Zodyağı Burcunuz : Öküz");
            case 6 -> System.out.println("Çin Zodyağı Burcunuz : Kaplan");
            case 7 -> System.out.println("Çin Zodyağı Burcunuz : Tavşan");
            case 8 -> System.out.println("Çin Zodyağı Burcunuz : Ejderha");
            case 9 -> System.out.println("Çin Zodyağı Burcunuz : Yılan");
            case 10 -> System.out.println("Çin Zodyağı Burcunuz : At");
            case 11 -> System.out.println("Çin Zodyağı Burcunuz : Koyun");
            default -> System.err.println("Hata !");
        }

    }
}
