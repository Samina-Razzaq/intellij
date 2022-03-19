package com.syntax.class18;

public class Task3 {
    //static method can access other static method fields
    // without needing an object of that class or class name
    // if they are inside the same class
    private static  String onlyVowels(String input){
        String newStr=input.replaceAll("[^aeiouAEIOU]", "");
        return newStr;
    }

    public static void main(String[] args) {


        System.out.println(onlyVowels("Emili"));
    }
}

