package com.syntax.class22;

public class Task3 {

    static void add(int number1, int number2){
        System.out.println("Addition :"+(number1+number2));
    }
    static void add(int number1, int number2, int number3){
        System.out.println("Addition :"+(number1+number2+number3));
    }
    static void add(int number1, int number2, int number3, int number4){
        System.out.println("Addition :"+(number1+number2+number3+number4));
    }

    public static void main(String[] args) {
        add(10,20);
        add(10,20,10);
        add(10,20,10, 20);
    }
}
