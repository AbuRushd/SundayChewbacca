package com.upskill.java_3;

public class Nested_Loop {

	public static void main(String[] args) {
		practiceNestedLoop();
	
	}
public static void practiceNestedLoop() {
	int i;
	int j;
	for (i=1; i<=10; i ++){
	for (j=1; j<=10; j ++){
	int multiplicationTable = i * j;
	System.out.print( multiplicationTable + " ");   // in this line need to remove ln from println
}
	System.out.println(" ");

}
}

}