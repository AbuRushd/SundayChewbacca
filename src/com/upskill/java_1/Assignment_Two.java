package com.upskill.java_1;

public class Assignment_Two {

	public static void main(String[] args) {
		
	    //	Formula of rectangle 	2*(a + b) 
		
        /*Problem 01: A rectangle width and length are: 9 and 13 inches.
	   Write a method to display the perimeter of rectangle in console output. */
		
		/*Problem 02: A rectangle’s width and length are: 6 and 9 inches.
		Write a method to display the perimeter of the rectangle in console output. */
		
		/*Problem 03: A rectangle’s width and length are: 7 and 11 inches.
		Write a method to display the perimeter of the rectangle in console output. */
		
		/*Problem 04: A rectangle’s width and length are: 4 and 9 inches.
		Write a method to display the perimeter of the rectangle in console output. */

                    Rectangle();
                    Rectangle1();
                    Rectangle2();
                    Rectangle3(); 
                    
                    /* formula of non-static method: 		
            	       class_name obj = new class_name ();
            		   obj.method_name(); */
                    Assignment_Two obj = new Assignment_Two ();
                    obj.Rectangle4();
                    Assignment_Two obj1 = new Assignment_Two();
                    obj1.Rectangle5();
                    Assignment_Two obj2 = new Assignment_Two();
                    obj2.Rectangle6();
                    Assignment_Two obj3 = new Assignment_Two();
                    obj3.Rectangle7();
                    
	}
	
	//Static Method:	
	
	public static void Rectangle() {
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
		System.out.println("Static : The perimeter of rectangle is " + c);	
	}
	public static void Rectangle1() {
		int a = 6;
		int b = 9;
		int c = 2 * (a+b);
		System.out.println("Static : The perimeter of rectangle is "+ c);
	}
	public static void Rectangle2() {
		int a = 7;
		int b = 11;
		int c = 2*(a+b);
		System.out.println("Static : The perimeter of rectangle is "+ c);
	}
	public static void Rectangle3() {
		int a = 4;
		int b = 9;
		int c = 2* (a+b);
		System.out.println("Static : The perimeter of rectangle is "+ c);		
	}
	
	//Non-Static Method:
	
	public void Rectangle4() {
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
		System.out.println("Non-Static : The perimeter of rectangle is "+ c);	
	}
	public void Rectangle5() {
		int a = 6;
		int b = 9;
		int c = 2*(a+b);
		System.out.println("Non-Static : The perimeter of rectangle is " + c);
	}
	public void Rectangle6() {
		int a = 7;
		int b = 11;
		int c = 2*(a+b);
		System.out.println("Non-Static : The perimeter of rectangle is " + c);		
	}
	public void Rectangle7() {
		int a = 4; 
		int b = 9;
		int c = 2*(a+b);
		System.out.println("Non-Static : The perimeter of rectangle is " + c);
	}
}

