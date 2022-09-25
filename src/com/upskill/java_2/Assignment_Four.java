package com.upskill.java_2;

public class Assignment_Four {
	/* Problem4. Write a for loop upto 500 which will increase the value double every time.*/
	public static void main(String[] args) {
		
		loopNumber(); 
	}
public static void loopNumber() {
	int i;
	for (i=1; i<=500; i=i*2){
	System.out.println("The loop number will be = " + i);
}
}
}