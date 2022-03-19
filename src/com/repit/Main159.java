package com.repit;

public class Main159 {
   int  subtraction(int num1, int num2){
      return num1-num2  ;
    }
    int  subtraction(int num1, int num2, int num3){
        return num1-num2-num3  ;
    }
    int  subtraction(int num1, int num2, int num3, int num4){
        return num1-num2-num3-num4  ;
    }

    public static void main(String[] args) {
        Main159 main=new Main159();
        System.out.println( main.subtraction(60,5,5,10));
        System.out.println( main.subtraction(100,30,40));
        System.out.println( main.subtraction(40,20));
    }
}
