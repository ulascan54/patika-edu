package Giris;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;
        boolean kosul1 = (a < b);
        boolean kosul2 = (a > c);
        boolean kosul3 = kosul1 && kosul2;// && -> ve
        boolean kosul4 = kosul1 || kosul2; // || -> veya
        boolean kosul5 = !(kosul1 && kosul2); // sonucun tersini alır

        c = a == b ? 1 : 0;// tek satırda if ? işareti eğer anlamına gelir : değilse anlamına gelir

        System.out.println(kosul1);
        System.out.println(kosul2);

        boolean d = true, f = false;
        System.out.println((d && f) || (d || f));
    }
}
