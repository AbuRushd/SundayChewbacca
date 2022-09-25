package com.upskill.java_1;

public class Assignment_Four {

	public static void main(String[] args) {
		/* Problem 04: A function returns 30, another function returns 50. 
		Write a java program which will display subtraction value from bigger number to smaller.*/
		functionReturn ();
		functionReturn1();
		int a = functionReturn1();  // here a is 50
		int b = functionReturn ();  // here b is 30
		int c = (a-b);
		System.out.println(c);
	}
public static int functionReturn () {
	return  30;
}
public static int functionReturn1() {
	return 50;
}
}


