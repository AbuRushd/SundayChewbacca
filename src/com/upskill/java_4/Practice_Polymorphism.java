package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Practice_Polymorphism extends MethodType{
	

	public static void main(String[] args) {
		 car();
		 car (4);
		 car("Zabbar");
		 
		 weeklyIncomeStatic();
		 
		 MethodType obj = new MethodType ();  									 
			obj.annualIncomeVoid();
			
			System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn()); 
		 
		
	}	 
	
public static void car() {        						// here method name is car               // here we are putting different signature to overload is but the method name is same always. 
	System.out.println("My car is AUDI");
}
public static void car(int door) {						// here method name is same car but just change the method parameter   
	System.out.println("My car is AUDI : " + door );	// this is method overloading as method name as before is same but changing the method parameter
}
public static void car (int door, int wheel) { 			// here method name is same car but just change the method parameter  
	System.out.println("My car is AUDI, it has door : " + door + ", it has wheels : " + wheel ); // this is method overloading as method name is same before 2, but changing the method parameter
}
public static void car(String Zabbar) {						// here method name is same car but just change the method parameter   
	System.out.println("My car name is  : " + Zabbar );   		// zabbar is the value of string
}
public static void weeklyIncomeStatic() {
	int weeklyIncome = hourlyIncome * 40 + 400;					// here i just copy and paste the method from method type and here i just add "+400" new as i override it. eg- nerob vi er uber income increased from the previous month as he drove 10 hours extra than regular 8 hours per day. 2 hours extra each day.					  
	System.out.println("My Weekly Income = " + weeklyIncome);
}
public void annualIncomeVoid() {
	int annualIncome = hourlyIncome * 2000 + 1000;                                   // here 2000 is hour
	System.out.println("My Annual Income = " + annualIncome);
}
	 public int monthlyIncomeReturn() {
		   int monthlyIncome = hourlyIncome * 180+200;									  // here 180 is hour
		   return monthlyIncome;
}
}