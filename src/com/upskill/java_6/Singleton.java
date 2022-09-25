package com.upskill.java_6;

public class Singleton {

	// Singleton is class that can have only one object  // singleton means : 1 object for 1 class
	
	// Private constructor, it prevents any other class from initiating  (create the get instance method public)
	
	// use public getInstance method
	
	// object will be private
	public Singleton() {
		
	}
	
	
	
	// Private static object of the class
	private static Singleton Singletonobj = new Singleton();	// it is a constructor cause it is as same as class name and also private so that no other method can access from any other class
	
	// Public static instance method
	public static Singleton getInstance () {   // here getInstance is the method name. note: method name can be anything
		return Singletonobj;
	}
	protected static void upskill() {
		System.out.println("Upskill method for Singleton Class");
	}
}
// singleton means 1 class & 1 object.