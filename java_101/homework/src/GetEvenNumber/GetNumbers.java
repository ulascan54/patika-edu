package GetEvenNumber;

import java.util.Scanner;

public class GetNumbers {
    /*
    Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

    Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n = input.nextInt();
        int total=0;
        int count=0;
        for (int i=1;i<=n;i++){
            if (i%4 == 0 || i+3==0){
                total += i;
                count++;
            }
        }
        System.out.println("3 ve 4 bölünen sayıların ortalaması :" + total/count);


    }
}
