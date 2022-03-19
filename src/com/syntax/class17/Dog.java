package com.syntax.class17;

public class Dog {
    //when info is going to be change
    // //for diff objects we store that info in instance variable
    String name;//instance
    String color;//instance
    //if we know value will be same for all objects of class
    //we create static variable
   static int numberOfLegs;//static

    void eat(){
        int noOfTimes=3;//local
        System.out.println(name+" eats" +noOfTimes);
    }

    public static void main(String[] args) {
        Dog healthyDog=new Dog();//local

        healthyDog.name="scooby";
        healthyDog.color="Pink";
        Dog.numberOfLegs=4;
        healthyDog.eat();
    }
}
