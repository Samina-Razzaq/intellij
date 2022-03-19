package com.repit;

public class Override164 {
    public static void main(String[] args) {
        Parent164[] parent={new Child1(), new Child2(), new Child3()};
        for(Parent164 p : parent){
            p.hello();
        }
    }
}
class Parent164{
    void hello(){
        System.out.println("method in parent class");
    }
}
class Child1 extends Parent164{
    void hello(){
        System.out.println("method in Child1 class");
    }
}

class Child2 extends Parent164{
    void hello(){
        System.out.println("method in Child2 class");
    }
}

class Child3 extends Parent164{
    void hello(){
        System.out.println("method in Child3 class");
    }
}