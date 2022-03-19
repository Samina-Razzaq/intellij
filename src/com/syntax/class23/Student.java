package com.syntax.class23;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism */

    void getGoodGrades(){
        System.out.println("Students need to work hard to get good grades");

    }
    void  study(){
        System.out.println("Students have to practice hard");
    }
}
class SyntaxStudent extends Student{
    @Override
    void getGoodGrades(){
        System.out.println("Syntax Students need to work hard to get through this course");

    }
    void  study(){
        System.out.println("Syntax Students have to practice hard for java understanding");
    }
}class  CollegeStudent extends Student {
    @Override

    void  study(){
        System.out.println("College Students have to be attentive in the class");
    }
}
class SchoolStudent extends Student{
    @Override
    void getGoodGrades(){
        System.out.println("School Students need to work hard to get to the college");

    }

}
class Main{
    public static void main(String[] args) {
        new Student().getGoodGrades();
        new Student().study();

        new SyntaxStudent().getGoodGrades();
        new SyntaxStudent().study();

        new CollegeStudent().getGoodGrades();
        new CollegeStudent().study();

        new SchoolStudent().getGoodGrades();
        new SchoolStudent().study();

        //create array
        // we can store object of child class in parent class
        //we can also create array of these students as shown below
        //classess are also treated as data type in java
        Student [] students={ new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};
        for(Student student:students){
            student.study();
            student.getGoodGrades();
        }
    }
}