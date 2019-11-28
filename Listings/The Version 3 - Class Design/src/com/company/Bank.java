package com.company;

import java.util.HashMap;

public class Bank {

    private HashMap<Integer,BankAccount> accounts = new HashMap<>();
    private double rate = 0.01;
    private int nextAcct = 0;

    public int newAccount(boolean isForeign){
        int acctnum = nextAcct++;
        BankAccount ba = new BankAccount(acctnum);
        ba.setForeign(isForeign);
        accounts.put(acctnum,ba);
        return acctnum;
    }

    public int getBalance(int acctnum){
        BankAccount ba = accounts.get(acctnum);
        return ba.getBalance();
    }

    public void deposit(int acctnum,int amt){
        BankAccount ba = accounts.get(acctnum);
        int balance = ba.getBalance();
        ba.setBalance(balance+amt);
    }

    public void setForeign(int acctnum,boolean isForeign){
        BankAccount ba = accounts.get(acctnum);
        ba.setForeign(isForeign);
    }

    public boolean authorizeLoan(int acctnum,int loanAmt){
        BankAccount ba = accounts.get(acctnum);
        int balance = ba.getBalance();
        return balance >= loanAmt / 2;
    }

    public String toString(){
        String result = "The bank has " + accounts.size() + " accounts.";
        for(BankAccount ba : accounts.values()){
            result += "\n\tBank account " + ba.getAcctnum() + ": balance = " + ba.getBalance() + ", is " + (ba.isForeign() ? "foreign" : "domestic");
        }
        return result;
    }

    public void addInterest(){
        for(BankAccount ba : accounts.values()){
            int balance = ba.getBalance();
            balance += (int) (balance*rate);
            ba.setBalance(balance);
        }
    }
}