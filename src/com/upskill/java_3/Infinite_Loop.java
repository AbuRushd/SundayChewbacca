package com.upskill.java_3;

public class Infinite_Loop {

	public static void main(String[] args) {
		//infiniteLoop() ;
		infiniteLoopOne();

	}
public static void infiniteLoop() {
	int i;
	for (i=1;; i++) {
		System.out.println("The infinite loop number = " + i);
	}
}
public static void infiniteLoopOne() {
			int i;
			for(i=1;; i--) {
				System.out.println("The infinite loop number = " + i);
			
		}
}
}
