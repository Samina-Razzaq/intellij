package com.syntax.class17;

public class SyntaxEmployee {
    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselObject =new SyntaxEmployee();
        aselObject.empId="123";
        aselObject.salary=200000;
        System.out.println( aselObject.empId);
        System.out.println( aselObject.salary);
        System.out.println( SyntaxEmployee.CEO);
        SyntaxEmployee moazzam=new SyntaxEmployee();
        moazzam.empId="456";
        moazzam.salary=198000;
        System.out.println( moazzam.empId);
        System.out.println( moazzam.salary);
        System.out.println( SyntaxEmployee.CEO);
    }
}
