package com.syntax.class21;

public class SuperDemo1 {

}
class AAA{

}class BBB extends AAA{
    String name;
    BBB(){

    }
    BBB(String name){
        super();
       // this(); we can not use this() and super() inside same constructor

        this.name=name;
    }
}