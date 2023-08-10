package MinMaxNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı giriceksiniz :");
        int n = input.nextInt();
        int eb=1,ek=0,en;
        for (int i = 0 ; i<n; i++){
            System.out.println((i+1)+". sayıyı giriniz:");
            en = input.nextInt();
            if (en>=eb) eb = en;
            if (en<=ek || (i==1)) ek = en;
        }
        System.out.println("En büyük sayı: "+eb);
        System.out.println("En küçük sayı: "+ek);

    }
}
