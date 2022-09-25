package com.upskill.java_1;

public class Variable {

	// 4 (four) types of  Variables in JAVA are following: (Instance or Global variable,  Static variable, local variable & Method parameter)
	
	public String country = "USA"; // this is called variable declaration
	
	public int a =2; // Instance or Global variable - Variables declared in class level, outside method
	
	public static String region = "America";        // Static variable - variables belong to class and do not required creating object
	
	public static void main(String[] args) {
		 int b =2;
		String city = "Jackson Heights";  	
		System.out.println(region);// Local variable -  variables declared in methods
		
		Variable obj = new Variable();
		System.out.println(obj.a);
		obj.method("");
	}
	
    public void method(String county) {		    	// Method parameter - variables used as method parameter
    	String myCounty = county;
 }
}
