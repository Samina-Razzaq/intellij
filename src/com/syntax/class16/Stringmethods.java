package com.syntax.class16;


public class Stringmethods {
    public static void main(String[] args) {

        String name="abcdefghabcd";

                                //indexOf()
        System.out.println(name.indexOf("d"));// tells index of specific character
        System.out.println(name.indexOf("d", 3+1));// tells index of the character repetition
        System.out.println(name.indexOf("n"));//-1 shows no such character present

                                //substring()
        System.out.println(name.substring(name.length()/2));//half substring
        System.out.println(name.substring(6));// give substring from index 6
        System.out.println(name.substring(4,8));// give from 4 to 7 does not include 8

                               //charAt(0)

        System.out.println(name.charAt(7));
        for(int i=0; i<name.length(); i++){     // it  prints all the characters in a string
            System.out.print(name.charAt(i));}

                                //reverse a string using charAt()
        System.out.println();

        String reverse="";
        for(int a=name.length()-1; a>=0; a--){
            reverse=reverse+name.charAt(a);
        }System.out.println(reverse);

                            //trim extra spaces
        System.out.println(name.trim());
                              // to check empty or not

        System.out.println(name.isEmpty());
                              //check starts with ends with and contain

        System.out.println(name.startsWith("abc"));
        System.out.println(name.endsWith("bcd"));
        System.out.println(name.contains("e"));
                             // gives length/size of string

        System.out.println(name.length());

    }
}
