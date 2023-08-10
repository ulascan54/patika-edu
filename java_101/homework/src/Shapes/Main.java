package Shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();

        String star ="*";
        int x = 1;
        for (int i = n ; i>=0; i--){
            for (int p = i ; p>0; p--){
            System.out.print(" ");
            }

            for (int j = 0 ; j<x; j++){
                System.out.print(star);
            }
            x+=2;
            System.out.println("");
        }

        System.out.println("====================");
        x=1;
        int q=1;
        for (int a = n ; a>=0; a--){
            if(a>=n/2){
            for (int b = a ; b>0; b--){
                System.out.print(" ");
            }

            for (int c = 0 ; c<x; c++){
                System.out.print(star);
            }
            if (a==n/2) x-=2;
            else x+=2;
            System.out.println("");
            }
            else {
                for (int b = 0 ; b<n/2+q; b++){
                    System.out.print(" ");
                }

                for (int c = 0 ; c<x; c++){
                    System.out.print(star);
                }
                x-=2;
                q++;
                System.out.println("");
            }
        }




    }
}
