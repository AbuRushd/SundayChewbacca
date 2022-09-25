package com.upskill.java_1;

public class Assignment_Three {
	
	/*Problem 01: A function which returns the multiply value of a and b where a = 9 and b = 11.
	Write a program which will display addition of a +b + function returns value. */
	
	/*Problem 02: A function that returns the multiply value of a and b where a = 5 and b = 9.
	Write a program that will display the addition of a +b + function returns the value. */
	
	/*Problem 03: A function that returns the multiply value of a and b where a = 11 and b = 13.
	Write a program that will display the addition of a +b + function returns the value. */
	
	/*Problem 04: A function that returns the multiply value of a and b where a = 7 and b = 13.
	Write a program that will display the addition of a +b + function returns the value. */
	
	public static void main(String[] args) {

		
// Problem 01:
int a = 9;	
int b = 11;
int c = returnValue();
System.out.println( "The Function returms value is = " + ( a + b+ c));

//Problem 02:
int a1 = 5;
int b1 = 9;
int c1 = returnValue1(); 
System.out.println( "The Function returms value is = " + (a1+b1+c1));
	}
	
	
// Problem 01:
public static int returnValue() {
	
	int a = 9;
	int b = 11;
	int c = (a*b);
	return c;
}
//Problem 02:
public static int returnValue1() {
	int a = 5;
	int b = 9;
	int c = (a*b);
	return c ; 
}
}

