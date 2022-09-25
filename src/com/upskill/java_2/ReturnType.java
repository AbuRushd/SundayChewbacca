package com.upskill.java_2;

public class ReturnType {

	public static void main(String[] args) {
	
		SilviSamir();   // here we need to declare the method name into a variable. here SilviSamir(); this method this declared as String (data type).  orr we can only rub by method name
		System.out.println(SilviSamir());    //    that is why variable a is declared as string too. 
		
		
		
		int b =  SamirSilvi();     // keep in mind that method name should must be declared as a variable
		System.out.println(b);
		
	}
public static String SilviSamir() { // this is a return method which is declared as String (in return method there should be no "void" word)
	 String A = "Samir";
	 String B = "Silvi";
	 return A;
}

public static int SamirSilvi() { 	// this is also a return method but its data type is int
	
	int a = 420;
	int b = 840;
	return b;
}
}
