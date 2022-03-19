package practice.com;

public class Main145 {

    public static void main(String[] args) {
        Dog dog1=new Dog("Tarzan", 50.0);
        dog1.displayInfo();
        Dog dog2=new Dog("Lucy", 10.0);
        dog2.displayInfo();
    }
}
class Dog{
    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    public Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
    void displayInfo(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}