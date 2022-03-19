package com.syntax.class24;

public interface Employee {
    public static final int age=10;
    void work();
    /* all the methods inside an interface which do not have body are abstract and public
    * by default all the variables in an interface are static public and final*/

}
class Tester implements  Employee{


    @Override
    public void work() {

    }

    public static void main(String[] args) {
        Tester test=new Tester();
        test.work();
        System.out.println(Employee.age);
    }
}
