package com.syntax.class24;

public  class Parent {
    final String name="Vladlen";
    final void method(){
       // name="Samina"; can not reassign value if variable is final
        System.out.println("I am parent");
    }
}
class Child extends Parent{
   // void method(){}//can not override method if final method is in parent class


}