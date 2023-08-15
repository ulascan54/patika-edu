package Giris;

public class OneDimensionalArrays {
    public static void main(String[] args) {
        //int[] numbers; // Burada numbers isminde bir dizi oluşturuluyor
        //int numbers[]; // Burada numbers isminde bir dizi oluşturuluyor
        int[] numbers2 = new int[5];
        numbers2[0] = 10; // Dizinin ilk elemanı 10 olarak ayarlandı.
        numbers2[1] = 15;
        numbers2[2] = 20;
        numbers2[3] = 25;
        numbers2[4] = 30;
        System.out.println(numbers2[3]);
        System.out.println(numbers2[5]); // Hata!
        // new e gerek yok -> String[] weekDays = new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };
        String[] weekDays = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

        int[] numbers3 = new int[100];
        System.out.println(numbers3.length); // Konsolda 100 yazar

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars2[0] = "Opel";
        cars2[2] = "Toyota";

        System.out.println(cars2[0]);


        int[] numbers = {35,65,95};
        System.out.print(numbers.length + "," + numbers[1]);

        int cars[], count=3;
        cars = new int[count];
        for(int i=0; i<cars.length; i++)
            cars[i] = (i+1)*2;
        for(int j=0; j<cars.length; j++)
            System.out.print(cars[j] + ",");
    }
}
