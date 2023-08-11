package Giris;

public class ReturnVoid {
    static void show()
    {
        System.out.println("Show metodu..");
        return;
    }

    static int toplam(int x, int y) {
        return x + y;
    }

    public static void main(String[] args)
    {
        int t = toplam(5,2);
        System.out.println(t);
        show();
    }
}
