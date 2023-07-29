import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /**
         * @outhor Ulas Can Demirbag, 2023
         */
        System.out.println("Hello World");
        System.out.print("begin \nworld");

        //veri tipi tanımlama
        //<veri tipi> <değişken ismi> = veri (değer)

        int number = 10;
        number =5;
        System.out.println("\n"+number);

        // çoklu tanımlama
        int numberOne, numberTwo = 2, numberThree;
        numberOne=1;
        numberThree= numberOne+numberTwo;
        System.out.println(numberThree);

        //örnek
        int kisaKenar = 10, uzunKenar=20;// değişken kullanarak ileride sadece değişkenlerle alan ve çevreyide belirlemiş oluruz
        int alan = kisaKenar*uzunKenar;
        int cevre = 2 * (kisaKenar*uzunKenar);
        System.out.println(alan);
        System.out.println(cevre);

        //byte,short,integer,long
        byte vByte=100;
        System.out.println(vByte);
        short vShort =1000;
        System.out.println(vShort);
        int vInteger= 2_000_000_000;
        System.out.println(vInteger);
        long vLong = 900000;
        System.out.println(vLong);

        //float,double : ondalıklı sayılar
        float vFloat= 3.14f;//float tanımlamardan sonra f veya F konulur
        System.out.println(vFloat);
        double vDouble= 3.14;
        System.out.println(vDouble);

    }
}
