package com.upskill.java_2;

/* Problem1. Write a for loop that prints 50 through 1 separated by spaces in the same line.*/

public class Assignment_one {

	public static void main(String[] args) {
		assigmentOne();                                      // static method
		
		  //Assignment_one obj = new Assignment_one ();		     // non-static method
		  //obj.assignmentOne1();
	}
	
	public static void assigmentOne() {						 // static method
		
		int i;
		for (i=1; i <=50; i ++) {
		System.out.println("The Loop number = " + i);
}

	}
public void assignmentOne1() {								 // non-static method
	
		int i;
		for (i=1; i<50; i++){
		System.out.println("The Loop[ number will be = " + i);
	}
}
}
