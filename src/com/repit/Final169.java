package com.repit;

public class Final169 {
    static int avgElements(int [] str){
        int sum=0;

        for(int i=0; i<str.length;i++){
            sum+= str[i];
        }
        return sum/str.length;}

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a));
    }
}
