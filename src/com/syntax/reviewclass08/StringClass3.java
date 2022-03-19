package com.syntax.reviewclass08;

public class StringClass3 {
    public static void main(String[] args) {
        String batch="batch 12";
        String course="SDET";

        String company="  Syntax Tech   ";
        System.out.println(company.trim());

        String name="nasir gopi krishan kjddhk hhhhsyew";
        System.out.println(name.replaceAll(" ",""));

        if("batch 12".equals(batch) && "SDET".equals(course)){
            System.out.println("you will get the link to MS as lecture");
        }else{
            System.out.println("Watch my youtube channel");
        }
        if("batch 12".equalsIgnoreCase(batch) && "SDET".equalsIgnoreCase(course)){
            System.out.println("Now all type of inputs are accepted");
        }
    }
}
