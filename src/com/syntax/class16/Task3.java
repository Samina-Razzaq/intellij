package com.syntax.class16;

public class Task3 {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        //		// input=>This is sentence i want to reverse
        //		// output=>sihT si ecnetnes i tnaw ot esrever
        StringBuilder stringBuilder=new StringBuilder("This is sentence i want to reverse");
        System.out.println(stringBuilder.reverse());

//get the word from syntax reverse the words
        String s="Sunday is great";
        String [] strArray=s.split(" ");
        for(int i=0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }

    }
}
