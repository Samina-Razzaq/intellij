package practice.com;

public class CarObjects {
    String model;
    double price;
    int quantity;

    public CarObjects(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
   void carStockValue(){
        double stockValue=price*quantity;
       System.out.println(model+" Stock Value "+stockValue);
    }
}
class MainCar{
    public static void main(String[] args) {


    CarObjects car1=new CarObjects("Toyota 2019",25000, 10);
    car1.carStockValue();
        CarObjects car2=new CarObjects("BMW 2019",36276.666, 18);
        car2.carStockValue();
}
}