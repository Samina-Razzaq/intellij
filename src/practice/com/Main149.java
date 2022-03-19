package practice.com;

public class Main149  {
    public static void main(String[] args) {
        B obj=new B();

        obj.methodB();
    }
}
class A{
    void methodA (){
        System.out.println("Class A");
    }

}class B extends A155 {
    void methodB(){
        System.out.println("Class B");}

}