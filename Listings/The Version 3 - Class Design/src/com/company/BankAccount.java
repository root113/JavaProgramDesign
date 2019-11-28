package com.company;

public class BankAccount {

    private int acctnum;
    private int balance;
    private boolean isForeign = false;

    public BankAccount(int a){
        acctnum = a;
    }

    public int getAcctnum() {
        return acctnum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amt) {
        balance = amt;
    }

    public boolean isForeign() {
        return isForeign;
    }

    public void setForeign(boolean foreign) {
        isForeign = foreign;
    }
}