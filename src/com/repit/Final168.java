package com.repit;

public class Final168 {
    final String reverseMethod(String str){
        StringBuilder newStr=new StringBuilder(str).reverse();
   return newStr.toString(); }

    public static void main(String[] args) {
        Final168 reverse=new Final168();

        System.out.println( reverse.reverseMethod("hello"));
    }
}
