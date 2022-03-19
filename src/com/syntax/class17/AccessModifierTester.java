package com.syntax.class17;

import com.syntax.class18.AccessModifier;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifier am= new AccessModifier();
        //System.out.println(am.name); private access
       // System.out.println(am.age); default access
       // System.out.println(am.weight); protected access
        System.out.println(am.color);// its public access
    }
}
