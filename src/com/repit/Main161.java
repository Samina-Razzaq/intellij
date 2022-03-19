package com.repit;

public class Main161 {

    private  void m1(){
        System.out.println("private m1 method");
    }
    private  void m1(int number){

        System.out.println("private m1 method with int parameter");
    }
    public static void main(String[] args) {
        Main161 obj=new Main161();
        obj.m1();
        obj.m1(10);
    }
}
