package Giris;

public class LocalVariable {
    static void number(int x, int z) {
        int y = 2;
        x = x * y;
        System.out.println(x);
    }

    static void kodluyoruz(String z)
    {
        String x = "Java101";
        z = "Kodluyoruz";
    }
    public static void main(String[] args) {
        int y = 3;
        int z = 2;
        if (y != z) {
            int x = 20;
        }
        int x = 50;
        number(x, z);

        String f = "Patika.dev";
        kodluyoruz(f);
        System.out.println(f);
    }
}
