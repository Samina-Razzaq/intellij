package practice.com;

public class StoreProduct144 {
    String lable;
    double price;
    String category;
    boolean hasExpiration;
    int stock;
    StoreProduct144(String lable, double price, String category, boolean hasExpiration, int stock){
        this.lable=lable;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct144(String lable, double price, int stock){
        this.lable=lable;
        this.price=price;
        this.stock=stock;
        this.category="misc";
        this.hasExpiration=false;
    }
    StoreProduct144(String lable, double price){
        this.lable=lable;
        this.price=price;
        this.stock=0;
    }
    public void display(){
        System.out.println(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
    }
}
class Main144{
    public static void main(String[] args) {
       StoreProduct144 obj1=new StoreProduct144("Eggs",3.0,"Produce",true,10);
       obj1.display();

        StoreProduct144 obj2=new StoreProduct144("Paper Towels",2.0,10);
        obj2.display();

        StoreProduct144 obj3=new StoreProduct144("Paper Towels",2.0);
        obj3.display();
    }
}