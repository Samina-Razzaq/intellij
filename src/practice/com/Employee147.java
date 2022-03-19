package practice.com;

public class Employee147 {
   String  name;
   String  lastName;
   int  employeeId;
   String  startDate;
    int salary;
    public Employee147(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }
public Employee147(){

}
void employeeDetails(){
    System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
}
}
class Main147{
    public static void main(String[] args) {
        Employee147 employee1=new Employee147();
        employee1.employeeDetails();

        Employee147 employee2=new Employee147("Joe","Smith", 12345, "01/01/1970", 35000);
        employee2.employeeDetails();
    }
}