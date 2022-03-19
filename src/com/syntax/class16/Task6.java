package com.syntax.class16;

public class Task6 {
    public static void main(String[] args) {

        String s="Sunday is great";
        Task6 task6=new Task6();
      //  System.out.println(task6.reverseString(s));
        String[] str=s.split(" ");
        for(int i=0; i< str.length; i++){
            System.out.print(task6.reverseString(str[i]+" "));
        }
    }




    String reverseString(String inputString){
        //converting string to string builder so we can use reveerse method
        StringBuilder str1=new StringBuilder(inputString);
        str1.reverse();
        return str1.toString();
    }
}
