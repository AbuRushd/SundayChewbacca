 package com_upskill_java_5;

public class Encapsulation {

	// Encapsulation is a process to hide data. It is used to hide data using setter & getter method.
	
	private String name = "Abu Md Rushdi";			// write & read					// 1
	private int ssn = 512456125; 					// write only					// 2
	private String username = "upskill";			// read only					// 3
	
	
	// setter method - name
	 public void setname (String value) {			// set the data, write			// 1      (non-static or void type)
		 name = value;
	 }
	 
	 // getter method - name
	 
	 public String getName() {						// get the data, read			// 1		(return type)
		 return name;
	 }
	
	 // Setter method - ssn															// 2
	public void setSSN(int value) {			   	    // write only     (setter type method will be always void non-static type method)
			ssn = value;
	}
	
	// Getter method																// 3
	public String getUserName() {    			 	// get the data   ( getter type method will be always return type method)
		return  username;
	}
		
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation(); 	// write & read				// void type										// 1 non-static or void type
		obj.setname("Abu Md Rushdi");				// write & read 			// void type										// 1 non-static or void type
		System.out.println(obj.getName());			// write & read 			 // return type										// 1 return type
		
		obj.setSSN(512456125);						// write only  ( write only can not be printed)	    	// void type			// 2 non-static or void type
	
		System.out.println(obj.getUserName());		// read only  (only read only can be printed)  		  // return type			// 3 return type
		
		
			
	}


	}


