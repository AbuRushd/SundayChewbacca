package com.upskill.java_3;

public class Loop_For {

	public static void main(String[] args) {
		
		//forLoop();
		//forLoopOne(); 
		forLoopTwo();
		//forLoopThree();
	}
public static void forLoop() {
	int  i;
	for (i =1; i<=10; i ++) {
	System.out.println("For Loops number = "  + i);
}
}
public static void forLoopOne() {
	int i;
	for (i = 1; i<10; i ++) {
		System.out.println("For Loops number = " + i);
	}
}
public static void forLoopTwo() {
	int i;
	for (i = 10; i >=1; i --) {
		System.out.println("For loops numner = " + i);
	}
}
public static void forLoopThree() {
	int i;
	for (i =10; i > 1; i --) {
		System.out.println("For Loops numnber = " + i);
	}
}
}