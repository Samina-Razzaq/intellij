package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();//prefer local but if local is not present then execute from parent class
        Suzuki suzuki =new Suzuki();
        suzuki.park();
        suzuki.start();
        System.out.println("-------------------");
        Car car =new BMW();//we can store object of child class in parent class
       // BMW bmw=new Car():
        car.start();
car=new Tesla();
car.start();
car=new Suzuki();
car.start();
    }
}
