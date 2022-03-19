package com.syntax.class19;

public class Student {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
    String name;
    double subjectEng;
    double subjectMath;
    double subjectJava;

    public Student(String name, double subjectEngEng, double subjectMath, double subjectJava) {

        this.name = name;
        this.subjectEng=subjectEngEng;
        this.subjectMath =subjectMath ;
        this.subjectJava=subjectJava ;
    }
    void printAvgGrade(){
        System.out.println("The average marks of student "+name+" are "+(subjectEng+subjectMath+subjectJava)/3);

    }
}
