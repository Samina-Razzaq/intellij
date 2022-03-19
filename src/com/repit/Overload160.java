package com.repit;

public class Overload160 {
    public void display(String name, String lastName){
        System.out.println("First name : "+name+ " Last name : "+lastName);
    }
    public void display(String name, String lastName, int age){
        System.out.println("First name : "+name+ " Last name : "+lastName+" Age : "+age);
    }
    public void display(int num, String schoolName, double number){
        System.out.println(num);
        System.out.println(schoolName);
        System.out.println(number);
    }

    public static void main(String[] args) {

        Overload160 obj=new Overload160();
        obj.display(100, "Syntax Technologies", 100.09);
    }
}
