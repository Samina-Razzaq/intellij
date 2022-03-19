package com.syntax.class24;

public class Computer {
    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override
some of the methods in child classes

Define some methods specific to child classes
Create objects of child classes and store them into array.
 Loop through each object and execute available methods.
     */

    void working(){
        System.out.println("Computer works good");
    }
    void memory(){
        System.out.println("164gb ");
    }
}
class Apple extends Computer {

    void working(){
        System.out.println("Apple works fast");
    }
    void memory(){
        System.out.println("132gb ");
    }
}
class Lenovo extends Computer{
    void memory(){
        System.out.println("64gb ");
    }
        void working(){
            System.out.println("Lenovo working is fine");
        }
        void batteryLife(){
            System.out.println("Lenovo battery life in not good");
        }
}
class Hp extends Computer{
    void memory(){
        System.out.println("164gb ");
    }
    void working(){
        System.out.println("Hp working is outstanding");
    }
    void appearance(){
        System.out.println("Look  of Hp is beautiful");
    }
}
class Dell extends Computer{
    void memory(){
        System.out.println("1000gb ");
    }
    void working(){
        System.out.println("Dell working is perfect");
    }

}

