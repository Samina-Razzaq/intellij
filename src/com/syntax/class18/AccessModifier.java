package com.syntax.class18;

public class AccessModifier {

    private String name="Naughty Tarik";
    int age=50;
    protected  double weight=50;
    public String color="White";

    public static void main(String[] args) {
        AccessModifier am= new AccessModifier();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
