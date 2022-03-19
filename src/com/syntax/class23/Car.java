package com.syntax.class23;
//Method overriding
//it happen when we have same name method in parent class and child class
//overload method without inheritance
//can only override a method with inheritance
//we can not override the private methods because they do not participate in inheritance
//we can not override the constructor because they do not participate in inheritance
//static method can not be overriden but overload can be
public class Car {
    void start(){
        System.out.println("use keys to start me");
    }
    void stop(){
        System.out.println("use breaks to stop me");
    }
    void park(){
        System.out.println("park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println(" start me with the button");
    }
    void stop(){
        System.out.println("can use breaks or i can autoBreak");
    }
    void park(){
        System.out.println("use parking sensor to park me");
    }

}
class Tesla extends Car{
    void start(){
        System.out.println(" start me with App or remote");
    }
    void stop(){
        System.out.println("can use breaks or i can autoBreak");
    }
    void park() {
        System.out.println("use parking sensor or i can auto park");
    }
}class Suzuki extends Car{
    void start(){
        System.out.println(" push me to start");
    }
    void stop(){
        System.out.println("I lost my breaks and tires on the way");
    }
    }