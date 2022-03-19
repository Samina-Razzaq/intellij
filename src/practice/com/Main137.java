package practice.com;

public class Main137 {
    //access modifier

    private String name;
    String city;
    protected String nameOfSchool;
    public int batchNumber;

    void printInfo(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "
                +nameOfSchool+" in batch "+batchNumber);
    }

    public static void main(String[] args) {

        Main137 obj=new Main137();
        obj.name="John";
        obj.city="Miami";
        obj.nameOfSchool="Syntax";
        obj.batchNumber=9;
        obj.printInfo();
    }
}
