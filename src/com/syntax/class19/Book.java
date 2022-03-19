package com.syntax.class19;

public class Book {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
    String name;
    String author;
   int  pages;

   Book(){
       System.out.println("constructor1");
   }
    Book(String name, String author, int pages){
        System.out.println("constructor 2");
       this.name=name;
       this.author=author;
       this.pages=pages;

    }
void bookDetails(){
    System.out.println("Book name is "+this.name);
    System.out.println("Book author is "+this.author);
    System.out.println("Book pages are "+this.pages);
}
}
