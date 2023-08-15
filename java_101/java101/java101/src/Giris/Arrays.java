package Giris;

public class Arrays {
    public static void main(String[] args) {
        /*
        double[] myList;   // tercih edilen yol

            veya

        double myList[];   // başka türlü tanımlama biçimi
         */
        double[] myList = new double[10];

        // Java'da diziye ilk değerler süslü parantezler arasında verilir.
        double[] myList2 = { 1.9, 2.9, 3.4, 3.5 };

        // tüm dizi elemanlarını arada boşuk bırakarak sırayla ekrana yazdırır.
        for (int i = 0; i < myList2.length; i++)
        {
            System.out.println(myList2[i] + " ");
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverse(int[] list)
    {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
        {
            result[j] = list[i];
        }

        return result;
    }
}
