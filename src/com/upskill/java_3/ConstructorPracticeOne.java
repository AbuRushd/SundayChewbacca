package com.upskill.java_3;

public class ConstructorPracticeOne {
String myName;
int myAge;

public ConstructorPracticeOne (String name, int age) {
	myName = name;
	myAge = age;
}

	public static void main(String[] args) {
		ConstructorPracticeOne obj = new ConstructorPracticeOne ("KhaledaZia", 75);
		System.out.println(obj.myName);
		System.out.println(obj.myAge);

	}

}
