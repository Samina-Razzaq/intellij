package com.repit;

public class Parent158 {
    String city;
    public Parent158(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println("City name "+city);
    }
}
class Child158 extends Parent158{

    public Child158(String city) {
        super(city);
    }
}
class Main158{
    public static void main(String[] args) {
        Child158 c=new Child158("Fairfax");
        c.display();
    }
}