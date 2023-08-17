package Transpoz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4},
                          {5,6,4}};
        int [] arr = new int[6];
        int[][]transpose = new int[3][2];
        int x = 0,p=0,l=3;
        for (int [] i : matrix) {
            for (int j : i) {
                arr[x] = j;
                x++;
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                if (j%2==0) {
                    transpose[i][j] = arr[p];
                    p++;
                }
                else {
                    transpose[i][j] = arr[l];
                    l++;
                }
            }
        }
        

        System.out.println("Matris :");
        printMatrix(matrix);
        System.out.println("Transpoze :");
        printMatrix(transpose);



    }
    public static void printMatrix(int matrix[][]){
        for (int [] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
