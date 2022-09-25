package com.upskill.java_3;

public class ConstructorPractice {
	
	String studentName;
	int studentAge;
	
	public ConstructorPractice (String name, int age) {
		studentName = name;
		studentAge = age;
		
	}

	public static void main(String[] args) {
		
		ConstructorPractice obj = new ConstructorPractice ("SeikhHasina", 70);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);

	}

}
