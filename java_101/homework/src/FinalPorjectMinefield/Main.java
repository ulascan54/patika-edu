package FinalPorjectMinefield;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int col,row,dificulty;
        Scanner scan = new Scanner(System.in);
        System.out.println("Oyun oluşturucuya Hoşgeldiniz");
        System.out.println("Satır sayısı giriniz:");
        row = scan.nextInt();
        System.out.println("Sutün sayısı giriniz:");
        col = scan.nextInt();
        do {
            System.out.println("Zorluk seviyesini giriniz:\n6 -> kolay\n4 -> orta\n2 -> zor");
            dificulty = scan.nextInt();
        } while (dificulty!=6 && dificulty!=4 && dificulty!=2);

        MineSweeper game = new MineSweeper(row,col,dificulty);
        game.run();
    }
}
