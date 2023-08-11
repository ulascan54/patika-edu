package Giris;

public class Recursive {
    public static void main(String[] args) {
        int sonuc = toplam(10);
        System.out.println(sonuc );
        System.out.println("Basamak toplami: "+basamaklarToplami(45612));
        System.out.println(as(3));
        recursiveMethod(4);

    }

    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }
    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }
    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }
    public static int toplam(int k) {
        if (k > 0) {
            return k + toplam(k - 1);
        } else {
            return 0;
        }
    }
}
