package com.syntax.class22;

public class Task4 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    
    private static void area(int width, int length) {
        System.out.println("The area of Square is : " + (width * length));
    }

    private static void area(int width) {
        System.out.println("The area of rectangle is : " + (width * width));
    }

    private static void area(int width, int length, int height) {
        System.out.println("The area of box is : " + (width * length * height));
    }

    public static  void main(String[] args) {

        Task4 obj=new Task4();
        area(5);
        area(7, 9);
       area(5, 7, 9);

    }
}