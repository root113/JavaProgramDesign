package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BankProgram {
    private HashMap<Integer,Integer> accounts = new HashMap<>();

    private double rate = 0.01;
    private int nextAcct = 0;
    private int current = -1;
    private Scanner scanner;
    private boolean done = false;

    public static void main(String[] args){
        BankClient bankClient = new BankClient();
        bankClient.run();
    }

}