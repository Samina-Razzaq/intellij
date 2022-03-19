package practice.com;

public class ShoppingStore148 {
    String item;
    double price;
    int quantity;
double totalValue;
    public ShoppingStore148(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.totalValue=price*quantity;
    }

    public void itemTotalPrice(){
        System.out.println(item+" Total Value "+totalValue);
    }
}
class Main148{
    public static void main(String[] args) {
        ShoppingStore148 blanket=new ShoppingStore148("Blanket", 99.98,1);
        blanket.itemTotalPrice();

        ShoppingStore148 mattress=new ShoppingStore148("Mattress", 439.18,1);
        mattress.itemTotalPrice();

        System.out.println("You purchased "+(blanket.totalValue+ mattress.totalValue)+" Today");
    }
}