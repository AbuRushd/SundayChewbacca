package com.upskill.java_1;

public class Assignment_Five {

	public static void main(String[] args) {
		/* Problem 05: Write a java program which will display name and estimated age of every students in your class.
		(write separate method for every student). */

		AbuMdRushdi(); 														// static method
		
		Assignment_Five obj = new Assignment_Five ();						// non-static method
		obj.MohammadHabibuzzaman(); 
		
		int age = ZahidulIslam();											// return type method
		System.out.println("Zahidul Islam, boro vi er age = " + 43);
		
	
	}
public static void AbuMdRushdi() {
	int age = 36;
	System.out.println("Abu Md Rushdi, choto vi er age = " + 36);
}
public void MohammadHabibuzzaman() {
	int age = 42;
	System.out.println("MohammadHabibuzzaman, mejho vi er age = " + 42);
}
public static int ZahidulIslam() {
	int age = 43;
	return age;
}
}
