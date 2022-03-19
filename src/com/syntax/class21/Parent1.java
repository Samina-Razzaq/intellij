package com.syntax.class21;


public class Parent1 {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends  Parent1{
    String name="Child";
    void printName(){
        String name="Tefur";// first priority to local variable then to child and then to parent
        System.out.println(name);
        System.out.println(this.name);//priority will be given to instance variable
        System.out.println(super.name);//priority will be given to parent instance variable
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();
    }
}