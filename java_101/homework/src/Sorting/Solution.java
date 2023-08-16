package Sorting;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz giriniz");
        int n = scan.nextInt();
        System.out.println("dizinin elemanlarını giriniz");

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+". elamanı giriniz");
            n = scan.nextInt();
            a[i] = n;
        }
        scan.close();
        Arrays.sort(a);
        System.out.print("Sıralama:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
