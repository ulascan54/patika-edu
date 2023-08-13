package Giris;

public class ConstructorMethod {
    public static void main(String[] args) {
        Car3 audi = new Car3("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        Car3 bmw = new Car3("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        Car3 mercedes = new Car3("Corporate" , "Mercedes" , "black");
        mercedes.speed = 20;
        mercedes.printInfo();

        Test obj = new Test();

    }
}
class Car3 {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // Constructor (Kurucu) Metot
    Car3(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Speed : " + this.speed);
    }
    // ...


}

class Test
{
    public Test()
    {
        System.out.printf("1");
        new Test(10);
        System.out.printf("5");
    }
    public Test(int temp)
    {
        System.out.printf("2");
        new Test(10, 20);
        System.out.printf("4");
    }
    public Test(int data, int temp)
    {
        System.out.printf("3");

    }


}