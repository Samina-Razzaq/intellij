package com.syntax.class22;
//Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
// In circle class create a method to calculate the area of circle. Test your code
public class Shape {
    double radius;

    public Shape(double radius) {

        this.radius = radius;
    }
}
class Circle extends Shape {
    double area;

    public Circle(double radius) {
        super(radius);
    }

    void method() {
        System.out.println("Area of circle with radius " + radius + " is " + (Math.PI*Math.pow(radius,2)));
    }
}
     class TesterArea{
         public static void main(String[] args) {
            Circle circle=new Circle(2);
            circle.method();

         }
     }