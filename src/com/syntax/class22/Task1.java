package com.syntax.class22;

public class Task1 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box

    static void area(int width, int length){

        System.out.println("The area of rectangle is : "+ (width*length));
    }
    static void area( int width){

        System.out.println("The area of square is : "+ (width*width));
    }
    static void area(int width, int length,int height){
        System.out.println("The area of box is : "+ (width*length*height));
    }

    public static void main(String[] args) {
        area(5);
        area(7,9);
        area(5,7,9);
    }

}
