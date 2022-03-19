package practice.com;

public class Parent154 {
    int number;
    public Parent154() {
        System.out.println("Parent Constructor without argument");
    }

    public Parent154(int number) {
        this.number = number;
        System.out.println(number);
    }
}
class Child154 extends Parent154{
    public Child154() {
        System.out.println("Child Constructor without argument");
    }
    public Child154(int n) {
       super(n);
    }
    void printNum(){

    }
}
class Main154{
    public static void main(String[] args) {
        Child154 c= new Child154();
        Child154 c2= new Child154(10);

    }
}