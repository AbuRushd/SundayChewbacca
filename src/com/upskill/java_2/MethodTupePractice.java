package com.upskill.java_2;

public class MethodTupePractice {

	public static int hourlyincome =  65;														// here $65 is income per hour
	
	public static void main(String[] args) {
		 annualIncome ();																		// static method
		 
		 MethodTupePractice obj = new MethodTupePractice();										// void or non-static method
		 obj.monthlyIncome();																	// void or non-static method
		 
		 System.out.println("My Weekly Income Returns in $ = " + obj.weeklyIncomeReturn());     // return-type method
		 

	}
public static void annualIncome () {
	int annualIncome = hourlyincome * 2080;														// here 2080 days per year
	System.out.println("My Annual Income in $ = " +  annualIncome);
}
public void monthlyIncome () {
	int monthlyIncome = hourlyincome * 172;														// here per month we work 172 hours approximately
	System.out.println("My Monthly Income in $ = " + monthlyIncome);
}
public int weeklyIncomeReturn () {
	int weeklyIncome = hourlyincome * 40;														// here per week we can work 40 hours approximately
	return weeklyIncome ;
}
}
