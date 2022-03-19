package com.syntax.class20;

public class C extends B{
    String phoneNumber="456-876-2345";
    void number(){
        System.out.println("And my phone number is "+phoneNumber);
    }

    public static void main(String[] args) {
        C child=new C();
        child.printInfo();
        child.colorInfo();
        child.number();
    }
}
