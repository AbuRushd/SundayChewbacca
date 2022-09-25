package com.upskill.java_2;

public class Assignment_Three {
	/* Problem3. Write two java functions which will return two different integer values,    
	write a program to compare those numbers and send message that one number is bigger than other. 
	(hints: using if..else)*/

	public static void main(String[] args) {
		integerValues();
		integerValuesOne();
		
		int a = integerValues();
		int b = integerValuesOne();
		int c = (b-a);
		System.out.println(c);
		
		integerValueTwo();
	}
public static int integerValues() {
	return 20;
}
public static int integerValuesOne() {
	return 30;
}
public static void integerValueTwo() {
	int a = 20;
	int b = 30;
	if (a>b); {
	System.out.println("a is greater than b");
}
	if (a<b); {
	System.out.println("a is smaller than b");

	
	}
}

}
