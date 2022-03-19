package com.syntax.class21;

public class ClassA {
    void method(){
        System.out.println("A");
    }
}
class ClassB extends ClassA{
   void method(){
        System.out.println("B");
    }
    void test(){
       this.method();//B calling method from B
       method();//B calling method from B
       super.method();//A calling method from A
    }
}
class Tester{
    public static void main(String[] args) {
        ClassB classB=new ClassB();
        classB.test();
    }
}