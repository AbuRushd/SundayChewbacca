package com.upskill.java_2;

public class IfElseStatement {
		
public static int age = 13;

public static void main(String[] args) {
			conditionalStatement();
		}
		
public static void conditionalStatement(){
			//If Else Statement
			if(age<13){
				System.out.println("You are children");
			} 
			else if (age>13 && age<18){
				System.out.println("You are Teenager");
			} 
			else if(age>65) {
				//Nested If Else Statement
				if(age > 100){
					System.out.println("You are Hero");
				}
				else {
				System.out.println("You are Senior");
				}
			}
			else {
				System.out.println("You are adult");
			}
			
			
//////////////// single loop/ single if-else condition

if (age >70) {
	System.out.println("silvi is a good girl");
}
	else {
		System.out.println("silvi ia clever girl");
	}

/////////////// nested loop/ more than one condition

if (age >80) {
	System.out.println("silvi is a good girl");
}
	else if (age <90){
		System.out.println("silvi ia dangerous girl");
	}
		else if (age>35) {
			System.out.println("Silvi is the best girl");
		} else {
			System.out.println("come out from the loop");
	}
		
if (age<18) {
	System.out.println("Habib vi is a young man");
}
else if (age>25) {
	System.out.println("Habib vi is an old man");	

}
else {
	System.out.println("Habib vi is an active man");
}
}
}