package practice.com;

public class Main150 {
    public static void main(String[] args) {

Employee employee=new Employee();
employee.name="Joe";
employee.lastName="Smith";
employee.age=35;
employee.salary=35000;
employee.printEmployee();

        Student student=new Student();
        student.name="Adam";
        student.lastName="Smith";
        student.age=15;
        student.grade=10;
        student.printStudent();

        Retiree retiree  = new Retiree();
        retiree.name="Frank";
        retiree.lastName="Smith";
        retiree.age=15;
        retiree.seniorActivity="tour";

        retiree.printRetiree();


    }
}
class Person{
    String name;
    String lastName;
    int age;

}
class Employee extends Person{
    int salary;
    void printEmployee(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends Employee {
    int grade;

    void printStudent() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}
    class Retiree extends Student{
        String seniorActivity;
         void printRetiree(){
             System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
         }


    }
