package PalindromeNumbers;

import java.util.Scanner;

public class Main {
    static boolean isPalidrom(int number){
        int temp = number, reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) +lastNumber;
            temp/=10;
        }
        if (reverseNumber == number)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();
        if(isPalidrom(n))
            System.out.println(n+" sayısı palidromdur.");
        else System.out.println(n+" sayısı palidrom değildir.");


    }
}
