package com.syntax.class16;

public class Task1 {
    public static void main(String[] args) {

        String a="Java is very difficult";
        String newString=a.replace(" ", "");
        System.out.println(newString);
        System.out.println("------------------");


        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric characters are there in the String.
        String s= "1234!@#$^^&*hhgCFRTDTRF";
        System.out.println(s.length());
        System.out.println(s.replaceAll("[^A-Za-z0-9@#]", "").length());//chaining
        //// length method to tell number of characters after replacement


    }
}
