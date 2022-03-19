package com.syntax.reviewclass07;

public class ObjectandClassPractice {

    String empName;
    int empId;
    String group;


    void employeeDetails(){
        System.out.println("This shows details of employee");
    }
    void employeeGroup(){
        System.out.println("This shows the group of employee");
    }

    public static void main(String[] args) {
        ObjectandClassPractice obj=new ObjectandClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();
    }
}
