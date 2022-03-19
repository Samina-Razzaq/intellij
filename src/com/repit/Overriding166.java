package com.repit;

public class Overriding166 {
    public static void main(String[] args) {
        Cat [] cat={new Cat("Cat"),new kitten1("Kitten1"), new kitten2("Kitten2"), new kitten3("Kitten3")};
        for(Cat c: cat){
            c.eat();
            c.sleep();
        }
    }
} class Animal {


    String animalName="Cat";

    public Animal(String animalName) {
        this.animalName = animalName;
    }
    void eat(){
        System.out.println(animalName+" eats");
    }
    void sleep(){
        System.out.println(animalName+ " sleeps a lot");
    }
}
class Cat extends Animal{

    public Cat(String animalName) {
        super(animalName);
    }

    void sleep(){

        System.out.println(super.animalName+" sleeps a lot");
    }
}
class kitten1 extends Cat{


    public kitten1(String animalName) {
        super(animalName);
    }

    void eat(){
        System.out.println(super.animalName+ " eats milk");
    }
}

class kitten2 extends Cat{
    public kitten2(String animalName) {
        super(animalName);
    }

    void eat(){
        System.out.println(super.animalName+ " eats snacks");
    }
}

class kitten3 extends Cat{
    public kitten3(String animalName) {
        super(animalName);
    }

    void eat(){
        System.out.println(super.animalName+ " eats everything");
    }

}