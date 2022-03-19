package com.repit;

public class Parent157 {
    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child157 extends Parent157{
    void m1(){
        System.out.println("m1 method in child class");
    }
    void m2() {
        this.m1();
        super.m1();
    }
}
class Main157{
    public static void main(String[] args) {
        Child157 c=new Child157();
        c.m2();
    }
}