package com.syntax.class18;

public class AcceccModifierTester {

    public static void main(String[] args) {
        AccessModifier am= new AccessModifier();
       // System.out.println(am.name);//can't access as name has private access
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
