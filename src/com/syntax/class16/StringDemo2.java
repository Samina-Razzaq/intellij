package com.syntax.class16;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="123456!@#$%^&*gdfgdjvcuFTTGHjwwn";
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[!-/]",""));
        System.out.println(str.replaceAll("[A-Z,0-9]",""));
        System.out.println(str.replaceAll("[^0-9]",""));
    }
}
