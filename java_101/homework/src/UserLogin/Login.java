package UserLogin;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız:");
        userName = input.nextLine();


        System.out.println("Şifreniz:");
        password = input.nextLine();

        if (userName.equals("ulas") && password.equals("1234")){
            System.out.println("Giriş Yaptınız !");
        }
        else {
            System.out.println("Bilgileriniz yalnış !");
            String newPassowrd;
            System.out.println("Şifrenizi sıfırlamak için yeni şifre giriniz:");
            newPassowrd =input.nextLine();
            System.out.println("Şifreniz sınıflandı giriş yapınız.");

            System.out.println("Kullanıcı Adınız:");
            userName = input.nextLine();


            System.out.println("Şifreniz:");
            password = input.nextLine();
            if (userName.equals("ulas") && newPassowrd.equals(password) ){
                System.out.println("Başarılı giriş yaptınız");
            }
            else {
                System.out.println("Error !");
            }
        }
    }
}
