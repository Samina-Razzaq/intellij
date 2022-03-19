package com.syntax.reviewclass08;

public class Class2 {
   String  generateUserName(String firstName, String lastName){
        return firstName+"123"+lastName+".com";
    }
    public static void moreedDemand(){
        System.out.println("this is moreed's function");
    }

    public static void main(String[] args) {
       moreedDemand();
        Class2 obj=new Class2();
        System.out.println( obj.generateUserName("Samina", "Khan"));

    }
}
