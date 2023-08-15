package NumbersInArrayAverage;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        double average = 0;
        int total = 0;
        for(int i = 0 ; i < numbers.length;i++){
            total += numbers[i];
        }
        average = total / numbers.length;
        System.out.println("ortalama:"+average);
        int harmonicAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonicAverage+=1/numbers[i];
        }
        System.out.println("harmonik ortalama:"+harmonicAverage);


    }
}
