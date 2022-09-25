package com.upskill.java_1;

public class Assignment_One {

	public static void main(String[] args) {
		
		// Formula : Parameter of a triangle is a + b + c
		
		/*Problem 01: 1.	A triangle three arms are: 5, 7 and 11 inches. 
		Write a method to display the perimeter of triangle in console output. */

		/*Problem 02: A triangle with three arms is: 4, 5, and 10 inches. 
		Write a method to display the perimeter of the triangle in console output. */

		/*Problem 03: A triangle with three arms is: 3, 4, and 13 inches. 
		Write a method to display the perimeter of the triangle in console output. */
		
		/*Problem 04: A triangle with three arms is: 10, 13, and 17 inches. 
		Write a method to display the perimeter of the triangle in console output. */

		Triangle ();
		Triangle1();
		Triangle2(); 
		Triangle3();
		
		/* formula of non-static method: 		
		   class_name obj = new class_name ();
		   obj.method_name(); */
		Assignment_One obj = new Assignment_One();
		obj.Triangle4();
		Assignment_One obj1 = new Assignment_One();
		obj1.Triangle5();
		Assignment_One obj2 = new Assignment_One();
		obj2.Triangle6();
		Assignment_One obj3 = new Assignment_One();
		obj3.Triangle7(); 
		
	}
	
	//Static Method:
	
public static void Triangle () {
	int a = 5;
	int b = 7;
	int c = 11;
	int d = (a+b+c);
	System.out.println("Static Method : The perimeter of triangle is " + d);
}
public static void Triangle1() {
	int a = 4;
	int b = 5;
	int c = 10;
	int d = (a+b+c);
	System.out.println("Static Method : The perimeter of triangle is " +d);
	
}
public static void Triangle2() {
	int a = 3;
	int b = 4;
	int c = 13;
	int d =(a+b+c);
	System.out.println("Static Method : The perimeter of triangle is " +d);
}
public static void Triangle3() {
	int a = 10;
	int b = 13;
	int c = 17;
	int d = (a+b+c);
	System.out.println("Static Method : The perimeter of triangle is " +d);
}

//Non-Static Method:

public void Triangle4() {
	int a = 5;
	int b = 7;
	int c = 11;
	int d = (a+b+c);
	System.out.println("Non-Static Method : The perimeter of triangle is " + d);
	
}
public void Triangle5() {
	int a = 4;
	int b = 5;
	int c = 10;
	int d = (a+b+c);
	System.out.println("Non-Static Method : The perimeter of triangle is " +d);
}
public void Triangle6() {
	int a = 3;
	int b = 4;
	int c = 13;
	int d =(a+b+c);
	System.out.println("Non-Static Method : The perimeter of triangle is " +d);
}
public void Triangle7() {
	int a = 10;
	int b = 13;
	int c = 17;
	int d = (a+b+c);
	System.out.println("Non-Static Method : The perimeter of triangle is " +d);
}
}