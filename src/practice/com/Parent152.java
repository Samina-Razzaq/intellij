package practice.com;

public class Parent152 {
    String city;

    public Parent152(String city) {
        this.city = city;
    }
    public Parent152(){
        System.out.println("Parent constructor");
    }
}
 class Child extends Parent152 {
     public Child(String city) {
         super(city);
     }
     void cityName(){
         System.out.println(city);
     }
 }
class Main152{
    public static void main(String[] args) {
        Child obj=new Child("Vienna");
        obj.cityName();
    }
}
