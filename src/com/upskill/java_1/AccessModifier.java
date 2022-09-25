package com.upskill.java_1;

public class AccessModifier {
	
	// 4 (four) Different Access Modifiers in JAVA are as following: (public, private, protected & default)

	public String name= "Rushdi"; 					// Public- any class can access

	private int age= 36;							// Private- only same class can access
	
	protected int ssn=2441139;						// Protected-class and subclass in the same package can access
	
	String city = "New York";                       // default - classes in same package can access
	
	
	public static void main(String[] args) {
		
		
	System.out.print("New York");				    // when we will print any string, under System.out.println
		                                            //   then the string's word or sentence should must be under ("");

	}
}
//public static void weeklyIncomeStatic() { }
//public void weeklyIncomeStatic() { }
//public static weeklyIncomeStatic() { }			(this is static return)
		   //  or
//public weeklyIncomeStatic() { }					(this is non-static return)


//private static void weeklyIncomeStatic() { }
//private void weeklyIncomeStatic() { }
//private static weeklyIncomeStatic() { }  		    (this is static return)
			// or
//private  weeklyIncomeStatic() { }				    (this is non-static return)


//protected static void weeklyIncomeStatic() { }
//protected void weeklyIncomeStatic() { }
//protected static weeklyIncomeStatic() { }			(this is static return)
			// or
//protected weeklyIncomeStatic() { }			    (this is non-static return)


//static void weeklyIncomeStatic() { }
//void weeklyIncomeStatic() { }
//public static weeklyIncomeStatic() { }			(this is static return)
			// or
//public weeklyIncomeStatic() { }					(this is non-static return)
