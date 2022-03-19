package practice.com;

public class A155 {
    public A155() {
        System.out.println("I");
    }
}
class B155 extends A155{
    public B155() {
        System.out.println("am");
    }
}
class C155 extends B155{
    public C155() {
        System.out.println("a tester");
    }
}
class Main155{
    public static void main(String[] args) {
        C155 C= new C155();
    }
}