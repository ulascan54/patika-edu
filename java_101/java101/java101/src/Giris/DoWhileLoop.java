package Giris;

public class DoWhileLoop {
    public static void main(String[] args) {
        int year = 2020;
        do
        {
            System.out.println("Döngü işletiliyor..");
            year++;
        } while (year < 2020);

        int age=20;
        do
        {
            age++;
        }while(age<20);

        System.out.println(age);


        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }

    }
}
