package MaxAndMinInArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int b;
        int max = 0, min=0;
        for (int i : list) {
            max=i;
            min=i;
            for (int j : list) {
                if (i>=j && i>=max)
                    max=i;
                if (j>=i && j>=max)
                    max=j;
                if (i<=j && i<=min)
                    min=i;
                if (j<=i && j<=min)
                    min=j;
            }
            break;
        }
        System.out.println("max "+max);
        System.out.println("min "+min);

        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
        int []  dizi = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int n = input.nextInt();
        int countMin = 0;
        int countMax = 0;
        for (int i : dizi){
            if (i<n)
                countMin++;
            if(i>n)
                countMax++;
        }
        int[] arrMin = new int [countMin];
        int[] arrMax = new int [countMax];
        int j= 0,x=0;
        for (int i : dizi)
            if (i<n){
                arrMin[j]=i;
                j++;
            }
            else{
                arrMax[x]=i;
                x++;
            }
        max = arrMin[0];
        for (int i :arrMin){
            if (i>max)
                max=i;
        }
        min = arrMax[0];
        for (int i :arrMax)
            if (i<min)
                min=i;
        System.out.println("Girilen değerden küçük en yakın sayı: "+ max);
        System.out.println("Girilen değerden büyük en yakın sayı: "+ min);






    }
}
