package RecursivePattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz giriniz:");
        int a = input.nextInt();
        System.out.println("Çıktısı:");
        calc(a,5, (a <= 0 ? false : true),a);
    }

    static int calc(int a, int i, boolean b,int z){
        if (!b){
            a=a+i;
            System.out.print(a+" ");
            if (a==z) return 0;
            return calc(a ,5, false, z);
        }
        if (b){
            a=a-i;
            System.out.print(a+" ");
            if (a<=0) return calc(a ,5, false, z);
            return calc(a ,5, true, z);
        }
        return 0;
    }
}
