package com.syntax.class23;

public class Task1 {
    //Create a class 'Degree' having a method 'getPrerequisite'
    // that prints ""To get a degree you need high school diploma"".
    public static void main(String[] args) {
        Degree degree =new Degree();
        degree.getPrerequisite();

        Masters masters=new Masters();
        masters.getPrerequisite();

        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
    }
}
class Degree{
    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    public void getPrerequisite(){
        System.out.println("To get a degree you need batchelors ");
    }
}