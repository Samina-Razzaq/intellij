package com.syntax.class24;

public class ComputerTester {
    public static void main(String[] args) {

        Computer []computer= {new Apple(), new Lenovo(), new Hp(), new Dell()};

        for(Computer c: computer){
           c.memory();
            c.working();


        }
    }
}
