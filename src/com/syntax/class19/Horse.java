package com.syntax.class19;

public class Horse {
    private String name;
    private int age;
    private double weight;
    void printHorseName(){
        System.out.println("Name "+name);}
    //no argument constructor
    Horse(){
        //write some important lines of code that you want to execute
        // when object of the class is created e.g you might want to fetch some info
        //from internet or from your hard disk to give initials values to the fields
    }
      //constructor name is same as class name
        // constructor doesn't have any return type not even void
    //purpose of constructor is to give initial values to the fields

    Horse(String horseName, int horseAge, double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }
    void setName(String horseName){
        name=horseName;
    }
}
