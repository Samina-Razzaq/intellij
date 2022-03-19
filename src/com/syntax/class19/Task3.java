package com.syntax.class19;

public class Task3 {
    //Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    String bookName;
    double price;

    public Task3(){
        System.out.println("No argument constructor");
    }
    public Task3(String bookName, double price){
        this();//calling no argument constructor
        this.bookName=bookName;
         this.price=price;
        System.out.println("Two argument constructor");
    }
}
