package Ticket;

import java.util.Scanner;

public class FlyTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, type;
        double total;
        System.out.println("Mesafeyi km türünden giriniz :");
        km = input.nextInt();

        System.out.println("Yaşınızı giriniz :");
        age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        type = input.nextInt();

        total = km * 0.10;
        if ((type == 1 || type == 2) && (km > 0) && (age > 0)) {
            if (age < 12)
                total -= total * 50 / 100;
            else if (age < 24)
                total -= total * 10 / 100;
            else if (age > 65)
                total -= total * 30 / 100;
            if (type == 2) {
                total -= total * 20 / 100;
                total *= 2;
            }
            System.out.println("Toplam Tutar :"+ total + " TL");
        } else {
            System.err.println("Hatalı veri girdiniz : (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır !!!");
        }
    }
}
