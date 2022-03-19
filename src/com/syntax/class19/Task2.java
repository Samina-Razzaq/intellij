package com.syntax.class19;

public class Task2 {

    //static constructors are not allowed from Task2
    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    String name;
    String address;

    public Task2(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }
}
