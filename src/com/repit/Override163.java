package com.repit;

public class Override163 {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.method();
    }

}
class Parent{
    void method(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    void method(){
        super.method();
        System.out.println("Child method");
    }
}