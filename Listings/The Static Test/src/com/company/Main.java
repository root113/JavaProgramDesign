package com.company;

public class Main {

    public static void main(String[] args) {
	    StaticTest s1 = new StaticTest(1);
	    s1.print(); //prints "1 1"

	    StaticTest s2 = new StaticTest(2);
	    s2.print(); //prints "2 2"
	    s1.print(); //prints "2 1"

		int a = StaticTest.getX();
		int b = s1.getX();

		System.out.println(a + " " + b);
    }
}
