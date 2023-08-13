package Giris;

public class Object {

    // create object syntax ClassName object = new ClassName();
    public static void main(String[] args) {
        Car audi = new Car();
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.speed = 20;
        mercedes.printSpeed();

    }
    Car audi = new Car();
    Car bmw = new Car();
    Car mercedes = new Car();
}
class Car2 {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

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
    // ...
}
