package Giris;

public class Overloading {
    static void ekranaYaz(int a) {
        System.out.println("Parametreler : " + a);
    }

    static void ekranaYaz(int a, int b) {
        System.out.println("Parametreler : " + a + " ve " + b);
    }

    static void show(int a, char b) {
        System.out.print("PATİKA PATİKA ");
    }

    static void show(char a, int b) {
        System.out.print("DEV DEV ");
    }
    /*

    static int info() {
        System.out.println("Patika");
        return 0;
    }

    static void info() {
        System.out.println("Dev");
    }

     */
    public static void main(String[] args) {
        //info();//derleme hatası

        show(25, 'A');
        show('B', 11);
        System.out.println("");
        ekranaYaz(5);
        ekranaYaz(10, 2);
    }
}
