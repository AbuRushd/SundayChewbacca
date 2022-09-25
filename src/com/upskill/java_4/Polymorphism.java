package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType {
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/ ////// same object performs in different way in different forms which depends on situation. eg: zahid vi is father in home, zahid vi is a student in upskill & zahid vi is an employee at office.
	public static void main(String[] args) {
	//Method Overloading (Compile time Polymorphism/Static binding)
    // Same method name with different signature
		
		car ();
		car (4);   // car (int door), here we have brought the method name like this at the beginning then we changed it
		car (2, 4);// car (int door , int wheel), here we have brought the method name like this at the beginning then we changed it
		car ("red"); // car (string color), here we have brought the method name like this at the beginning then we changed it
		
		//	 	Method Overridding - Routine Polymorphism -  Dynamic Binding
		// Same method name from Parent class to override	
		
		weeklyIncomeStatic();
		
		bus ();
		bus (40); 
		bus ("VOLVO") ;
		bus ("black");
	}
	// over=loading:
	
public static void car () {
	System.out.println("My car is Audi");
}
public static void car (int door) {
	System.out.println("My car is Audi, it has door : " + door);
}
public static void car (int door, int wheel) {
	System.out.println("My car is Audi, it has door : " + door + "it has wheel : " + wheel) ;
}
public static void car (String color) {
	System.out.println("My car is Audi, it has color : " + color);
}
// over-ridding:

public static void weeklyIncomeStatic() {
	int weeklyIncome = hourlyIncome * 40 + 1000;										 
	System.out.println("My Weekly Income = " + weeklyIncome);									  
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void bus () {
	System.out.println("Bus name is GreenLine");
}
public static void bus (int seat) {
	System.out.println("The total number of seat is :" + seat);
}
public static void bus (String VOLVO) {
	System.out.println("The brand of bus is : " + VOLVO);
}
public static void bus (String black, String White) {
	System.out.println("The color of the bus is : " + black + "another color is " +  White);
}

}
