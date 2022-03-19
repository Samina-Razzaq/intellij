package com.syntax.reviewclass07;

import java.util.Locale;

public class Practice5 {
    String weekDay (String day) {
        day=day.toLowerCase();
        switch(day){
            case"Monday":
                return "It is lazy day";
            case"Tuesday":
                return "It is produvtive day";
            case"Wednesday":
                return "It is gloomy day";
            case"Thursday":
                return "It is exciting day";
            case"Friday":
                return "no work day";
            default:
                return "no correct option found";
        }

    }


    public static void main(String[] args) {
        Practice5 p= new Practice5();
        p.weekDay("Friday");
    }




}
