package com.upskill.java_3;

import com.upskill.java_2.MethodType;

public class Inheritance extends MethodType {    // to inherit the Methodtype we need to use the word "extends" & then we need to copy paste the class name "MethodType"

	/* The process of obtaining the data members and methods from one class to another is known as inheritance.
	 * Single inheritance (child class & parent class)
	 * Multiple inheritance (Java does not support multiple inheritance directly rather though interfaces) (multiple parent class & child or father-mother & child class)
	 * Multilevel inheritance (grand parent, parent & child class)
	 */
	
	////////////////////////////////////////////////////
	////////////////////////////////////////////////////
	// single inheritance : parent (single parent either father or mother) & child
	// multiple inheritance : multiple parent (father with mother) & child
	// Multilevel inheritance: grand parent, parent & child
	
	public static void main(String[] args) {
		Inheritance obj = new Inheritance ();
		obj.annualIncomeVoid();     // here we calling the method name from method type
		obj.weeklyIncomeStatic();   // here we calling the method name from method type
		
	}

}
