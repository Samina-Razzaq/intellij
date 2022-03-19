package com.syntax.class19;

import com.syntax.class20.Parent;

public class Child extends Parent {
    void printInfo(){
        // System.out.println(name); private access
       // System.out.println(age); default access
        System.out.println(weight);
        System.out.println(color);
    }
}
