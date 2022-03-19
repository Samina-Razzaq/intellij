package com.syntax.class18;

public class AccountTester {
    public static void main(String[] args) {
        Account account=new Account();
       // System.out.println(account.printUserName);
       // System.out.println( account.printPassword);
        //System.out.println(account.printBalance);
       // System.out.println( account.printAccountNumber);
        //accessing a field directly is different from accessing the same field with methods
        //having different modifier
       // /account.printUseName();//private access
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }
}
