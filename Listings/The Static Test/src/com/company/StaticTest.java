package com.company;

public class StaticTest {
    private static int x;
    private int y;

    public StaticTest(int val){
        x = val;
        y = val;
    }

    public void print(){
        System.out.println(x + " " + y);
    }

    public static int getX(){
        return x;
    }
}
