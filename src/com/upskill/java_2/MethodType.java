package com.upskill.java_2;

public class MethodType {

	/* 3 (three) Types of Methods:
	 
	 		 1. Void Method
	 		 2. Static Method
	  		 3. Return Type Method
	 */
	
	public static int hourlyIncome = 65;										  // income per hour $65
	
	public static void main(String[] args) {
		
		MethodType obj = new MethodType ();  									  // Void method
		obj.annualIncomeVoid(); 												  // Void method
	
		// formula : class_name obj = new class_name ();						  // Void method
		//           obj.method_name();											  // Void method
		
		weeklyIncomeStatic();													  // Static method
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());   // Return Type Method

	}
/* Void method:
	    // formula of void method :
	    // public void method_name () {
	    //
	    //                    } 	 */
	
	public void annualIncomeVoid() {
// access modifier(public)   method-type(void)     method-name(annualIncomeVoid)	
		int annualIncome = hourlyIncome * 2000;                                   // here 2000 is hour
		System.out.println("My Annual Income = " + annualIncome);
	}
/* Static method */
   
   public static void weeklyIncomeStatic() {
// access modifier(public)   method-type(static void)     method-name(weeklyIncomeStatic)	   
	int weeklyIncome = hourlyIncome * 40;										  // 40 hours in a week
	System.out.println("My Weekly Income = " + weeklyIncome);
}
   
 /* Return Type Method */
   
   public int monthlyIncomeReturn() {
	   int monthlyIncome = hourlyIncome * 180;									  // here 180 is hour
	   return monthlyIncome;
   }
}

