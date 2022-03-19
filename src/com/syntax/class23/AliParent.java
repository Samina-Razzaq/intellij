package com.syntax.class23;

public class AliParent {
    String girlName="Salma";
    double money=10000000;
    void marry(){
        System.out.println("Ali you should marry "+girlName);
    }
}
class Ali extends AliParent{
    String girlName="Taylor Swift";
    void marry(){
        super.marry();
        System.out.println("But Dad i want to marry "+girlName);
    }
}