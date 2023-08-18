package FinalPorjectMinefield;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String[][] mineMatrix;
    String[][] gameMatrix;
    int mineCount;

    public MineSweeper(int rowNumber, int colNumber, int dificulty) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineMatrix = new String[rowNumber][colNumber];
        this.gameMatrix = new String[rowNumber][colNumber];
        this.mineCount = (rowNumber * colNumber) / dificulty;
        createMatrix();
    }

    public void generateRandomMain() {
        Random random = new Random();
        int randomNumberRow, randomNumberCol;
        for (int i = 0; i < this.mineCount; i++) {
            randomNumberRow = random.nextInt(this.rowNumber);
            randomNumberCol = random.nextInt(this.colNumber);
            if (!this.mineMatrix[randomNumberRow][randomNumberCol].equals("*")) {
                this.mineMatrix[randomNumberRow][randomNumberCol] = "*";
            } else i--;
        }
    }

    public void createMatrix() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.mineMatrix[i][j] = "-";
                this.gameMatrix[i][j] = "-";
            }
        }
    }

    public void printMatrix(String[][] matrix) {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMineMatrix() {
        System.out.println("==================================");
        System.out.println("---Mayinlarin Konumu---");
        generateRandomMain();
        printMatrix(this.mineMatrix);
        System.out.println("==================================");
    }


    public void checkGuesses(int guessRow, int guessCol) {
        int count = 0;
        for (int i = (guessRow - 1); i <= (guessRow + 1); i++) {
            for (int j = (guessCol - 1); j <= (guessCol + 1); j++) {
                if (i < 0 || j < 0 || i >= this.rowNumber || j >= this.colNumber) {
                    continue;
                }
                if (this.mineMatrix[i][j].equals("*")) {
                    count++;
                }
            }
        }
        this.gameMatrix[guessRow][guessCol] = String.valueOf(count);
        printMatrix(this.gameMatrix);
    }

    public boolean isFinish() {
        int count=0;
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if (this.gameMatrix[i][j].equals("-")) {
                   count ++;
                }
            }
        }
        if (count==mineCount) return true;
        else return false;
    }

    public void run() {
        Scanner inp = new Scanner(System.in);
        int guessRow, guessCol;
        String hint;


        System.out.println("---Mayin Tarlasi Oyununa Hosgeliniz---");
        do {
            System.out.println("Mayın Konumunu görmek istermisiniz (Y/N)");
            hint = inp.nextLine();
        }while (!(hint.equalsIgnoreCase("yes")|| hint.equalsIgnoreCase("y")||
                hint.equalsIgnoreCase("no")|| hint.equalsIgnoreCase("n")));
        if (hint.equalsIgnoreCase("yes")|| hint.equalsIgnoreCase("y")) printMineMatrix();
        printMatrix(this.gameMatrix);
        while (true) {
            System.out.println("=======================================");
            System.out.print("Satir Giriniz -->");
            guessRow = inp.nextInt();
            guessRow -=1;
            System.out.print("Sutun Giriniz -->");
            guessCol = inp.nextInt();
            guessCol -=1;
            if (guessRow > rowNumber || guessCol > colNumber) {
                System.out.println("!--Map sinirlari disinda secim yaptınız tekrar giriniz---!");
                System.out.println("---Tekrar Deneyiniz---");
                continue;
            }
            if (mineMatrix[guessRow][guessCol].equals("*")) {
                System.out.println("💥💥💥 --> GAMEOVER <-- 💥💥💥");
                break;
            }
            checkGuesses(guessRow,guessCol);
            if (isFinish()) {

                System.out.println("🎉🥳🚀 --- Tebrikler Kazandınız --- 🎉🥳🚀");
                break;
            }
        }
    }
}
