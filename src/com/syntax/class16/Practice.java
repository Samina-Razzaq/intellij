package com.syntax.class16;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


        String name="azlan";
        if(name.length()/2!=0 &&name.length()>=3){
            System.out.println(name.charAt(name.length()/2));
        }

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String[] str=word.split("");

        for(int i=0; i<str.length; i+=1){
            System.out.print(str[i]);
        }



        StringBuilder builder=new StringBuilder("Hello ");

        builder.append("World".toUpperCase());
        System.out.println(builder);
        System.out.println(builder);







    }
}
