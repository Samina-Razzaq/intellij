package com.syntax.class19;

public class Task1 {
    String name;
    int age;
    Double weight;

    private Task1(int age){

        System.out.println("Private access ");   }
    Task1(){
        System.out.println("Default Access");
    }


    protected Task1( String name){

        System.out.println("Protected access ");
    }
    public Task1(double weight){

        System.out.println("Public access ");

    }



    public static void main(String[] args) {
       new Task1();
       new Task1("sam");
       new Task1(25);
       new Task1(10.2);
    }
}
