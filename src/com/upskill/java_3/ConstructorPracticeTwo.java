package com.upskill.java_3;

public class ConstructorPracticeTwo {

	String studentname;
	int studetnage;
	
	public ConstructorPracticeTwo (String name, int age) {
		studentname = name;
		studetnage = age;
	}
	public static void main(String[] args) {
		ConstructorPracticeTwo obj = new ConstructorPracticeTwo ("Ershad Kaku", 95);
		System.out.println(obj.studentname);
		System.out.println(obj.studetnage);

	}

}
