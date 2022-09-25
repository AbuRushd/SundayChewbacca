package com.upskill.java_6;

public class Exception_TryCatchFinale {

	// Exception: when you run any code then you get some error, then it is called exception. We can call exception also run-time exception.
	// Interviewer may ask : how you use Exception method?
    // Answer will be, "I use Try-Catch-Finally" block/method/formula"
	
	/* Java Exceptions - Use "try - catch - finally"
	 * 
		A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations ( this exception is already built by java)
			 1. Arithmetic Exception - error has occurred in an arithmetic operation.     // when we have some problem with math like plus, minus, multiplication
			 2. Array Index Out Of Bounds Exception -  an array has been accessed with an illegal index.    
			 3. Class Not Found Exception - try to access a class whose definition is not found     
			 4. File Not Found Exception - it happens when a file is not accessible or does not open.     
			 5. I O Exception - input-output operation failed or interrupted   
			 6. Interrupted Exception  - thread is waiting, sleeping, or doing some processing, and it is interrupted.   
			 7. No Such Field Exception - when class does not contain the field or variable specified   
			 8. No Such Method Exception - accessing a method which is not found   
			 9. Null Point erException - referring to the members of a null object     // if we can't able to create object then it is called null point exception
			 10. Number Format Exception  -  a method could not convert a string into a numeric format     
			 11. Run time Exception - any exception which occurs during runtime. // when any occurs happen during run-time     
			 12. String Index Out Of Bounds Exception -  String class methods to indicate that an index is either negative or greater than the size of the string    //
		
		B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java (here we've to built java program by own)
	*/
	
	public static void main(String[] args) {
		
		//  Built-in Exceptions - Array Index Out Of Bounds Exception
		try {
			int[] ageChewbaccha = new int [] {25, 26, 60, 45, 55, 35};
			System.out.println("Student Age : " + ageChewbaccha[6]);
		} catch (Exception e) {
			System.out.println("Array index not available");
			e.printStackTrace();
	}
		// Specific Built-in Exceptions - Number Format Exceptions
		try {
			int num = Integer.parseInt("Test");
			System.out.println("Value of num int = " + num);
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid number");
			e.printStackTrace();
	}
		// User Define Exception
		
		try {
			throw new myException ("Test");
		}catch(myException e) {
			System.out.println("User Define Exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("Test Execution Completed");
		}
}
}






