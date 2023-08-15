package Giris;

import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //reverse matrix
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //all input from user
        int matrix3[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix3.length + " rows and "
                + matrix3[0].length + " columns: ");
        //random matrix
        for (int row = 0; row < matrix3.length; row++) {
            for (int column = 0; column < matrix3[row].length; column++) {
                matrix3[row][column] = input.nextInt();
            }
        }

        int[][] matrixr = new int[3][4];
        for (int row = 0; row < matrixr.length; row++) {
            for (int column = 0; column < matrixr[row].length; column++) {
                matrixr[row][column] = (int) (Math.random() * 100);
            }
        }


        int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
    /*
        degiskenTipi[][] arrayIsmi;
        int matrix[][];

        degiskenTipi arrayIsmi[][];  //bu yöntem tercih edilmez
     */
        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int matrix2[][] = new int[3][4];

        //matrix = new int[3][4];
        /*
        [0][1][2][3]
        [0] 0 0 0
        [1] 0 0 0
        [2] 0 0 0
         */
        /*
        matrix[1][2]; // Matrisin 2. satır ve 3. sütunundaki elemana erişiliyor
        matrix[0][3]; // Matrisin 1. satır ve 4. sütunundaki elemana erişiliyor
        matrix[2][0]; // Matrisin 3. satır ve 1. sütunundaki elemana erişiliyor
         */
        int[][] matrix = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix.length; x++)
        {
            int[] row = matrix[x];

            for (int y = 0; y < row.length; y++)
            {
                row[y] = number;
                number++;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }


        System.out.println("==");
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i)
             for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                sum += arr[i][j];
        System.out.print(sum);

    }
    public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {

        // firstMatrix.length ile ilk matrisin satır sayısını buluyoruz. örneğimizde 3 olarak gelecektir.
        // secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz. örneğimizde 4 olarak gelecektir.

        // C matrisi olacak olan matrisi tanımlıyoruz.
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

        // matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }

        return result;
    }


    double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        // A matrisinin satırı ile B matrisinin sütunu çarpma işlemi.
        /*
         *   row = 3, col = 4  olarak gelecektir.
         *   i = 0 ise
         *   firstMatrix[3][0] * secondMatrix[0][4]
         *   i = 1 ise
         *   firstMatrix[3][1] * secondMatrix[1][4]
         *   i = 2 ise
         *   firstMatrix[3][2] * secondMatrix[2][4]
         * şeklinde i değişerek satır ve sütun çarpılır.
         */
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }

    /*
    Düzensiz matrix
    int[][] matrix = new int[3][];
    matrix[0] = new int[1];
    matrix[1] = new int[2];
    matrix[2] = new int[3];
     */
}
