package practice.com;

public class Parent153 {
    public Parent153() {
        System.out.println("This is Parent constructor");
    }
}
class Child153 extends Parent153{
    public Child153() {
        super();
    }
    void callParent(){

    }
}
class Main153{
    public static void main(String[] args) {
        Child153 child=new Child153();
        child.callParent();
    }
}