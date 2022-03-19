package practice.com;

public class Car143 {
    String make="unknown";
    String model="unknown";
    int numberOfDoors=4;
    int topSpeed=90;
    double price=0;

    public Car143(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car143(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;

    }

    public Car143(int numberOfDoors, int topSpeed, double price) {
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car143(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;

    }

    void carDisplay(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}
class Main{
    public static void main(String[] args) {
        Car143 car1=new Car143("Toyota","Prius", 4, 120, 30000.0);
        car1.carDisplay();
        Car143 car2=new Car143("Toyota","Prius", 120, 30000.0);
        car2.carDisplay();
        Car143 car3=new Car143( 4, 120, 30000.0);
        car3.carDisplay();
        Car143 car4=new Car143("Toyota","Prius", 4);
        car4.carDisplay();
    }
}