package Giris;

import com.sun.security.jgss.GSSUtil;

public class Operators {
    public static void main(String[] args) {
        int a = 5, b = 2;
        // aritmatik operators
        System.out.println(a * b);//çarpma
        System.out.println(a / b);//bölme
        System.out.println(a + b);//toplama
        System.out.println(a - b);//çıkarma
        System.out.println(a % b);//mod alma

        //atama operators;
        int c = 7, z = 1;
        int d = c;
        z = z + 2; // z+=2
        z += 3;
        z -= 3;
        z *= 3;
        z /= 3;
        z %= 3;
        System.out.println(d);

        // Karşılaştırma operators
        boolean sonuc = (1 == 5);
        boolean notSonuc = (1 != 5);
        boolean sonucL = (1 < 5);
        boolean sonucLL = (1 > 5);
        boolean sonucLLL = (1 <= 5);
        boolean sonucLLLL = (1 >= 5);
        System.out.println(sonuc);
        System.out.println(notSonuc);
        System.out.println(sonucL);
        System.out.println(sonucLL);
        System.out.println(sonucLLL);
        System.out.println(sonucLLLL);
        //0 yalnış
        //1 doğrudur

        //mantıksal operators
        int v1 = 5, v2 = 1, v3 = 5;
        boolean kosul1 = v1 == v3;
        boolean kosul2 = v1 >= v2;
        boolean sonucz = kosul1 && kosul2;
        System.out.println(sonucz);
        v2=6;
        kosul2 = v1 >=v2;
        sonucz = kosul1 && kosul2;
        System.out.println(sonucz);
        sonucz = kosul1 || kosul2;
        System.out.println(sonucz);
        boolean soncuz2= ((v1==v3) || (v1>=v2));
        System.out.println(soncuz2);

        //kosul operators
        String str= (sonucz) ? "doğru" : "değil";// veritipleri aynı olmalı

        System.out.println(sonucz);




    }
}
