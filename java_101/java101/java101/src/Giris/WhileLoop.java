package Giris;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Program başladı");
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("Program bitti");

        int left = 100, right = 200;
        while (++left < --right) ;
        System.out.println("100 ile 200'ün ortası: " + left);


        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while (!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if (customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }

        int a=1;
        while(a<4)
        {
            System.out.print(a + " ");
            a++;
        }


    }
}
