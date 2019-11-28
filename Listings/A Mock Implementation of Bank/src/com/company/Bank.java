package com.company;

public class Bank {

    public int newAccount(){
        System.out.println("newAccount called, returning 10");
        return 10;
    }

    public int getBalance(int acctnum){
        System.out.println("getBalance(" + acctnum + ") called, returning 50");
        return 50;
    }

    public void deposit(int acctnum,int amt){
        System.out.println("deposit(" + acctnum + ", " + amt + ") called");
    }

    public boolean authorizeLoan(int acctnum,int loanamt){
        System.out.println("authorizeLoan(" + acctnum + ", " + loanamt + ") called, returning true");
        return true;
    }
}
