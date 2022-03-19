package com.syntax.class16;

public class Task7 {
    boolean isPalindrome(String inputStr){
        String reverseStr=reverseString(inputStr);//reverse a word
        return reverseStr.equals(inputStr);//checking if words are same
    }
    String reverseString(String inputString){
        //converting string to string builder so we can use reverse method
        StringBuilder str1=new StringBuilder(inputString);
        str1.reverse();
        return str1.toString();}
    public static void main (String[] args) {
        Task7 task=new Task7();
            System.out.println(task.isPalindrome( "aba"));
            System.out.println(task.isPalindrome("Abbc"));


        //palindrome

    }

}
