package com.syntax.class17;

public class Students {
    String studentName;
    String id;
    static  int numberOfStudents=35;


    public static  void main(String[] args) {

     Students std1=new Students();
     std1.studentName="Samina";
     std1.id="sam123";
     Students.numberOfStudents=3;

        Students std2=new Students();
        std2.studentName="Samina";
        std2.id="sam123";
        Students.numberOfStudents=4;

        Students std3=new Students();
        std3.studentName="Samina";
        std3.id="sam123";
        Students.numberOfStudents=5;

        System.out.println("Total number of students = "+numberOfStudents   );




    }


























}
