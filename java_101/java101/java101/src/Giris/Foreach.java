package Giris;

public class Foreach {
    public static void main(String[] args) {
        String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"};
        for (String i : arabalar) {
            System.out.println(i);
        }

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.println(elem);
            }
        }

        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}
