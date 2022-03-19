package com.syntax.class19;

public class Frog {
    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight=weight;
       // double weight=20;
       // this.weight = 10;
    }

    public Frog(String name, String color, int age, double weight) {
      this(name, color, age);//chaining constructor by using this/this() should be first step
        this.weight = weight;
    }
    void printInfo(){
        //this() not allowed inside the methods
        //this(name, color, age)
        System.out.println(name+" "+color+" "+age+" "+weight);

    }
}
