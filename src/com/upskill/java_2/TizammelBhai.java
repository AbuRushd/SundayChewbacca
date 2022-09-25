package com.upskill.java_2;

public class TizammelBhai {

	public static int hourlyIncome = 50;
	
	public static void main(String[] args) {
	
		weeklyIncomeStatic();
		
		int annualIncome = hourlyIncome * 1000;
		System.out.println("My Annual Income = " + annualIncome);
		
		TizammelBhai obj = new TizammelBhai();
		obj.monthlyIncomeReturn();
		
		System.out.println("My Name is Rushdi = " + obj.monthlyIncomeReturn());
		

	}
public static void weeklyIncomeStatic() {  // here void means it returns nothing
	int weeklyIncome = hourlyIncome * 20;
	System.out.println("My Annual Income = " + weeklyIncome);
}

// return type method
public int monthlyIncomeReturn() {         // here the word void is not mentioned, so it has to be return something
	int  monthlyIncome = hourlyIncome * 100;
	return monthlyIncome;
	
}
}
