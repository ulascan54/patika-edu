package PrimeNumber;

public class Main {
    public static void main(String[] args) {
        boolean x=false;
        for (int i=2; i<=100; i++){
            for (int j= 2; j<= 100 ; j++){
                if (i==j) continue;
                if (i%j == 0){
                    x=false;
                    break;
                }
                else {
                    x=true;
                }
            }
            if (x) System.out.print(i+" ");
        }
    }
}
