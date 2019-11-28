package com.company;

import java.util.Scanner;

public class BankClient {
    private int current = -1;
    private Scanner scanner = new Scanner(System.in);
    private boolean done = false;
    private Bank bank = new Bank();

    public void run(){
        scanner = new Scanner(System.in);
        while(!done){
            System.out.println("0 = Quit\n1 = New\n2 = Select\n3 = Deposit\n4 = Loan\n5 = Show\n6 = Interest\nEnter command: ");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
        scanner.close();
    }

    private void processCommand(int cmd){
        if(cmd == 0) quit();
        else if(cmd == 1) newAccount();
        else if(cmd == 2) select();
        else if(cmd == 3) deposit();
        else if(cmd == 4) authorizeLoan();
        else if(cmd == 5) showAll();
        else if(cmd == 6) addInterest();
        else
            System.out.println("Illegal command!");
    }

    private void quit(){
        done = true;
        System.out.println("Goodbye!");
    }

    private void newAccount(){
        current = bank.newAccount();
        System.out.println("Your new account number is: " + current);
    }

    private void select(){
        System.out.print("Enter account#: ");
        current = scanner.nextInt();
        int balance = bank.getBalance(current);
        System.out.println("The balance of account " + current + " is " + balance);
    }

    private void deposit(){
        System.out.print("Enter deposit amount: ");
        int amt = scanner.nextInt();
        bank.deposit(current,amt);
    }

    private void authorizeLoan(){
        System.out.print("Enter account#: ");
        current = scanner.nextInt();
        System.out.print("Enter loan amount: ");
        int loanAmt = scanner.nextInt();
        if (bank.authorizeLoan(current,loanAmt))
            System.out.println("Your loan is approved!");
        else
            System.out.println("Your loan is denied!");
    }

    private void showAll(){
        System.out.println(bank.toString());
    }

    private void addInterest(){
        bank.addInterest();
    }
}