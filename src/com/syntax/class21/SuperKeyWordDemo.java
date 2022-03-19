package com.syntax.class21;

public class SuperKeyWordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
    }
}
class GrandParent{
    String color="Blue";
    void printInfo(){
        System.out.println("I am Grandpa");
    }
}
class Parent extends GrandParent{//more related one is executed like parent
    String color="Black";
    void printInfo(){
        System.out.println("I am Parent");
    }
}
class Child extends  Parent{
    String color="Red";
    void printInfo(){
        System.out.println("I am child");
    }
    void printColor(){
        String color="Green";
        System.out.println(color);//this local will be preffered instance
        System.out.println(this.color);//if we use this. we can have instance variable
        System.out.println(super.color);
    }
}