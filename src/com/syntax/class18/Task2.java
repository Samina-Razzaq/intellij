package com.syntax.class18;

public class Task2 {

    public static String reverseString(String input){
       // StringBuilder stringBuilder= new StringBuilder(input);
       // stringBuilder.reverse();
      // return stringBuilder.toString();
return new StringBuilder(input).reverse().toString();
         //StringBuilder(input) object creation
        //.reverse() calling method on that object
        //toString()calling second method on object and returning the result

    }

    public static void main(String[] args) {
        String name="Emili";
        System.out.println(Task2.reverseString(name));
    }
}
//