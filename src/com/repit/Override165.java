package com.repit;

public class Override165 {
    public static void main(String[] args) {

        Child165 child = new Child165();
        child.m1();
        child.m2();
        child.m3();
    }
}
class Parent165{
   public void m1(){
       System.out.println("I am parent public method");
   }
    protected void m2(){
        System.out.println("I am parent protected method");
    }
    void m3(){
        System.out.println("I am parent default method");
    }
   private void m4(){
        System.out.println("I am parent private method");
    }
}
class Child165 extends Parent165{
    public void m1(){
        System.out.println("I am a child public method");
    }
    protected void m2(){
        System.out.println("I am a child protected method");
    }
    void m3(){
        System.out.println("I am a child default method");
    }
    private void m4(){
        System.out.println("I am a child private  method");
    }

}