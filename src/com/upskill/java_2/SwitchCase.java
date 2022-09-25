package com.upskill.java_2;

public class SwitchCase {

	public static int day = 6;						// static method
	
	public int month = 12;							// non-static method
	
	public static void main(String[] args) {
		
		 weekDay();									// static method
		 
		 SwitchCase obj = new SwitchCase();			// non-static method
		 obj.year();								// non-static method

		 /* formula of Switch Case:
		  * 		public static void / public void method_name (){     
		  * 		switch (name should must be related with method name) {
		  * 		case 1; (here serial number also should must be related with method name)
		  * 		break; (here break it also has to be used as per also method name like for year it will be 1 to 12 times & for week it will be 1 to 7 times)
		  * }
		  */
	}
	
  // Static method
	
public static void weekDay() {
	switch(day) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thrsday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	}
}
// Non-Static Method

public  void year() {
	switch(month) {
	case 1:
		System.out.println("January");
		break;
	case 2:
		System.out.println("February");
		break;
	case 3:
		System.out.println("March");
		break;
	case 4:
		System.out.println("April");
		break;
	case 5:
		System.out.println("May");
		break;
	case 6:
		System.out.println("June");
		break;
	case 7:
		System.out.println("July");
		break;
	case 8:
		System.out.println("August");
		break;
	case 9:
		System.out.println("September");
		break;
	case 10:
		System.out.println("October");
		break;
	case 11:
		System.out.println("Novenmber");
		break;
	case 12:
		System.out.println("December");
		break;
}
}
}