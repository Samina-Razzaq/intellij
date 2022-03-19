package com.repit;

public class Abstract173 {
    public static void main(String[] args) {
               LemonTea lemon=new LemonTea("Lemon");
               lemon.addSugar();
               ChaiTea chai=new ChaiTea("Chai");
               chai.addSugar();
    }
}
abstract class Tea{
    String teaType;

    public Tea(String teaType) {
        this.teaType = teaType;
    }
    abstract void addSugar();
}
class LemonTea extends  Tea{
    public LemonTea(String teaType) {
        super(teaType);
        this.teaType = teaType;
    }
    void addSugar(){
        System.out.println("For "+teaType+" Tea we need 2 spoons of sugar");
    }
}

class ChaiTea extends  Tea{
    public ChaiTea(String teaType) {
        super(teaType);
        this.teaType = teaType;
    }
    void addSugar(){
        System.out.println("For "+teaType+" Tea we need 1 spoon of sugar");
    }
}