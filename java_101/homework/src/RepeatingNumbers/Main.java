package RepeatingNumbers;


public class Main {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0, 2, 2, 4, 4, 13, 15, 15};
        int[] duplicate = new int[dizi.length];
        int startIndex = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j] && dizi[i] % 2 == 0) {
                    duplicate[startIndex++] = dizi[i];
                }
            }
        }

        int count = 0;
        for (int i = 0; i < duplicate.length; i++) {
            if (i == count && duplicate[i]!=0) {
            System.out.println(duplicate[i]);
                for (int j : duplicate) {
                    if (duplicate[i] == j) {
                        count++;
                    }
                }
            }
        }
    }
}
