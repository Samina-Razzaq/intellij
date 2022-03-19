package com.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s= new String("Asghar Is Great");
        System.out.println(s.replace(" ", ""));
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Asghar is Great");

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);

        s.concat("hahah");
        // System.out.println(s.concat("hahah"));
        System.out.println(s);



        stringBuilder.append("Hahha");
        // System.out.println(stringBuilder.append("Hahha"));
        System.out.println(stringBuilder);










    }
}
