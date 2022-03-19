package com.syntax.class16;

public class StringDeno3 {
    public static void main(String[] args) {
        String s="This is a sentence";
        String[] strArr=s.split(" ");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);

        String s2="This is a sentence. Batch 12 is great." +
                " Edward is not great. He is super great";
        String[] strArr2=s2.split("[.]");
        System.out.println(strArr2.length);
        System.out.println(strArr2[3].trim());



    }
}
