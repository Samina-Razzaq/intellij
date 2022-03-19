package com.repit;

public class Overload162 {
    public static void display() {
        System.out.println("static method without parameter");

    }

    public static void display(int number) {
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {


        Overload162 obj = new Overload162();
        obj.display();
        obj.display(10);
    }
}