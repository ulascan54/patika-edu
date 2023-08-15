package Giris;
import java.util.Arrays;
public class ArraysUtil {

    public static void main(String[] args) {
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(dizi));

        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 3, 5, 7);
        System.out.println(Arrays.toString(liste2));

        int[] liste3 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(liste3);
        System.out.println(Arrays.toString(liste3));
        int index = Arrays.binarySearch(liste3, 33);
        System.out.println("33'ün indeksi :" + index);

        int[] liste4 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        Arrays.sort(liste4);//-> olmazsa bualamz
        System.out.println(Arrays.toString(liste4));
        int index1 = Arrays.binarySearch(liste4, 15);
        System.out.println("33'ün indeksi :" + index1);


        int[] liste22 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(liste22, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste22, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 10};

        System.out.println(Arrays.equals(arr1, arr2)); // true
        System.out.println(Arrays.equals(arr2, arr3)); // false
    }
}
