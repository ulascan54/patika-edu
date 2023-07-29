package CalculateNotes;

import java.util.Scanner;

public class CalculateNotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fizik,kimya,turkce,tarih,muzik,mat;

        System.out.println("Matematik Notunuzu Giriniz:");
        mat = input.nextFloat();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = input.nextFloat();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = input.nextFloat();

        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce = input.nextFloat();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = input.nextFloat();

        System.out.println("Müzik Notunuzu Giriniz:");
        muzik = input.nextFloat();

        double ort = (fizik + kimya +turkce +muzik + tarih +mat)/6 ;
        System.out.println("Ortalamanız: " +ort);

    }
}
