package Grades;

import java.util.Scanner;

public class PassingGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matematik,fizik,turkce,kimya,muzik,ort,count;
        count = 0;
        System.out.println("Matematik notunuzu giriniz:");
        matematik = input.nextDouble();
        if (matematik >0 && matematik<100){
            count++;
        }else{
            matematik=0;
        }

        System.out.println("Fizk notunuzu giriniz:");
        fizik = input.nextDouble();
        if (fizik >0 && fizik<100){
            count++;
        }else{
            fizik=0;
        }

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextDouble();
        if (turkce >0 && turkce<100){
            count++;
        }else{
            turkce=0;
        }

        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextDouble();
        if (kimya >0 && kimya<100){
            count++;
        }else{
            kimya=0;
        }

        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextDouble();
        if (muzik >0 && muzik<100){
            count++;
        }else{
            muzik=0;
        }

        ort = (matematik+fizik+kimya+turkce+muzik)/count;

        switch ((int) ort){
            case 55:
                System.out.println("Geçtin");
                break;
            default:
                System.out.println("Kaldın\nOrtalaman:"+ort);
                break;
        }

    }
}
