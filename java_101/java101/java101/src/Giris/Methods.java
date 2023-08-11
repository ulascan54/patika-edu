package Giris;

public class Methods {

    static int toplama(int a, int b) {
        int c= run(5);
        return a + b;
    }

    public static void main(String[] args) {
        int sonuc = toplama(5, 2);
        System.out.println(sonuc);
        System.out.println(run(5));

    }


    static int run(int x) {
        x = 10;
        return x;
    }
}
