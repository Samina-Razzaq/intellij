package com.syntax.class19;

public class Cow {
    static int normalNumberOfLegs=4;
    //when we do not assign values to instance variables java assign them default values
    private String name;
    int age;
    double weight;
    String breed;

    //the constructor that is provided automatically by java is default constructor
    //the constructor created by us without argument is zero argument

    Cow(){
        // you might want to execute some codes to setup the resources for your class
        //like opening connections, to database is checking if internet is available or not
    }
}
