package RecursiveFibonacci;

import java.util.Scanner;

public class Main {
     static int fibo(int a){
        if (a == 1 || a ==2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bulmak istideğiniz fibonacci adımını giriniz:");
        int n = input.nextInt();
        System.out.println(fibo(n));

    }
}
