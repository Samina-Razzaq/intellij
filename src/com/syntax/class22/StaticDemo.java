package com.syntax.class22;

public class StaticDemo {

}
class Cat{
    static int noOfLegs=4;
    String name;
    Cat(String name){
        this.name=name;
    }
    public void printInfo(){
        System.out.println(name+noOfLegs);
    }
    public static void print(){
        //we can't access instance fields directly inside static method
       // System.out.println(name+noOfLegs);
        //we can't use instance fields with static method'
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");
        Cat.print();
        Cat cat2=new Cat("neutella");
    }
}