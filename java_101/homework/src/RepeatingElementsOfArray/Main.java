package RepeatingElementsOfArray;

/*
    Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
    Tekrar Sayıları
    10 sayısı 3 kere tekrar edildi.
    20 sayısı 4 kere tekrar edildi.
    5 sayısı 1 kere tekrar edildi.
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] arr2 = new int[arr.length];
        int count = 0;
        boolean isPresent=false;
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            isPresent=false;
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    count++;
            }
            for (int x : arr2) {
                if (arr[i]==x) {
                    isPresent=true;
                }
            }
            if (!isPresent){
                arr2[p]=arr[i];
                p++;
                System.out.println(arr[i]+" sayısı "+count+" kere tekrar edildi.");

            }

        }
    }
}
