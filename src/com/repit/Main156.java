package com.repit;

public class Main156 {
    public static void main(String[] args) {
        B b =new B();
        b.printValue();
    }
}
class A{
    int i=10;
}
class B extends A{
    int i=20;
    void printValue(){
        System.out.println(this.i);
        System.out.println(super.i);
    }
}