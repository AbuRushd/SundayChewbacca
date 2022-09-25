package com.upskill.java_3;
/* Constructor is instance of class, method same as class name, java will execute constructor first
 * Constructor can not be static or override nor void or return type,
 * Default constructor: no constructor is initiated
 * Parameterized constructor: add different signature
 * Constructor overloading: different signature 
 */
public class Constructor {
	
	String studentName;												// variable declare
	int studentAge;													// variable declare
	
	public Constructor(String name, int age) {
		studentName = name;											// variable initialize
		studentAge = age;											// variable initialize
	}
	
	public static void main(String[] args) {
	
		Constructor obj = new Constructor ("Rushdi", 36);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
	}
// constructor can not be static, not return type nor even void
}
