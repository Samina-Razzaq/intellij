package com.syntax.class24;

public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Making a phone call");
    }
    void sendTex(){
        System.out.println("Sending a text");
    }
    abstract void displayPicture();
}
abstract class Iphone extends Phone{
    void displayPicture(){
        System.out.println("Use photo app to display the pic");
    }
}class Samsung extends Phone{
    void displayPicture(){
        System.out.println("Use gallery to display the pic");
    }
}