package com.syntax.reviewclass07;

public class Practice2 {
String getRecord(){
    String department="QA";
    String empName="Voilet";
    String details="worker "+ empName +" belongs to "+department;
    System.out.println(details);
    return details;
}

    public static void main(String[] args) {
        Practice2 p=new Practice2();
        p.getRecord();
    }

}
