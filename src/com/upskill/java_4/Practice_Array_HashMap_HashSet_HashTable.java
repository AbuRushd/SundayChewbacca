package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Practice_Array_HashMap_HashSet_HashTable {

	public static void main(String[] args) {
	
		// (in array we do not need to create any sub-method. we just need to work under main method)
		// please note that we do not need to write line 11, line 15, line 19, line 23 & line 28 . it is given to show the (p.t.o.)
		// difference between variable & array as variable contains 1 value & array contains multiple value
		
		
		// this is single dimension array:
		
		int[] todayIsWednesday = new int [] { 21, 22, 23, 24, 25};
		System.out.println("New number will be : " + todayIsWednesday[01]);
		
		String[] todayIsAwesome = new String [] {"Nerob", "Zahid", "Habib", "Rushdi", "Tizammel", "Imran"};
		System.out.println("The name of the student is : " + todayIsAwesome[3]);
		
		int[] todayIsBeautiful = new int [] { 12, 13, 14, 15, 16};
		System.out.println("The latest number is : " + todayIsBeautiful[4]);
		
		String []  weThreeBrother = new String [] {"Khaleda", "Zia", "Seikh", "Hasina", "Ershad", "Kaku"};
		System.out.println("The new PM will be : " + weThreeBrother[5]);
		
		int age= 20;
		int[]ageWeThree = new int [] { 10, 20, 30};          					// here ageWeThree is the array name,  name can be anything
		System.out.println("Age of us : " + ageWeThree[0]);
		
		int [] weAreFour = new int [] { 11, 12, 13};
		System.out.println("Our age is : " + weAreFour [2]);
		
		int age1 = 20;
		int[] joyBangla = new int [] {15,25,35};             					 // here joyBangla is the array name,  name can be anything
		System.out.println("My age is : " + joyBangla[1]);
		
		String name = "Rushdi";
		String[] WeThree = new String[] {"Zahid", "Habib", "Rushdi"};  			   // here WeThree is the array name,  name can be anything
		System.out.println("The best Student is : " + WeThree[1] );
 
		String we = "Zahid";
		String [] bangladeshZindabaad= new String [] {"Khaleda", "Zia", "BD"};   	// here bangladeshZindabaad is the array name,  name can be anything
		System.out.println("We are the best : " + bangladeshZindabaad[0]);
		
		// To get the total amount/value/count of the students or numbers
		String sunday = "morning";
		String[] sundayMorningGroup = new String[] {"Zahid", "Habib", "Imran", "Omar", "Pappu", "Rushdi"};  // please note that here ( sundayMorningGroup ) is the array name,  name can be anything
		System.out.println("The students are : " + sundayMorningGroup[4]);
		System.out.println("Total no of students  : " + sundayMorningGroup.length); // here we just need to add (.length) just after array name to get the total number
		
		// this is multi-dimension (two dimentional) array:
		
		int[][] ageWeThree2d = {{ 10, 20, 30},   // please note that here (ageWeThree2d ) is the array name,  name can be anything
				                { 15, 25}};
		System.out.println("Age of the Student : " + ageWeThree2d[0][1]);
		System.out.println("My age is : " + ageWeThree2d[1][1]);
		
		
								
		

		// HASH-MAP
		
		HashMap<String, Integer> WeThree1 = new HashMap<String, Integer>();   // please note that here (WeThree1) is the hashMap name,  name can be anything
		WeThree1.put ("Zahid",10);
		WeThree1.put ("Habib",20 );
		WeThree1.put ("Rushdi", 30);
		System.out.println("The name of the Student : " + WeThree1.get("Rushdi")); // in hashMap we've to use (hashMap_name.put) to enter data & (hashMap_name. get) to get data
		
		HashMap<Integer, String> upskillAge = new HashMap<Integer, String>();
		upskillAge.put (20, "Khaleda");
		upskillAge.put (30, "Hasina");
		upskillAge.put (40, "Ershad Kaku");
		System.out.println("The name of the PM is : " + upskillAge.get(20));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		Capital.put ("Bangladesh", "Dhaka");
		Capital.put ("India", "Mumbai");
		Capital.put ("USA", "WDC");
		System.out.println("The capital city is : " + Capital.get("India"));
		
		HashMap<Integer, Integer> studyWell = new HashMap<Integer, Integer>(); // please note that here (studyWell) is the hashMap name,  name can be anything
		studyWell.put (420, 840);                                                   // is hashmap we can put duplicate/same value
		studyWell.put (840, 420);
		System.out.println("You are a pervert, so u are : " + studyWell.get(840) );
		
		HashMap <String, String> loveRunsBlind = new 	HashMap <String, String>();
		loveRunsBlind.put ("Silvi", "Samir");
		loveRunsBlind.put ("Upskill", "Downskill");
		System.out.println("The name will be : " + loveRunsBlind.get("Silvi"));
		
		// HASH-SET
		
		HashSet <String> car = new HashSet <String> ();  // here car is hash-set name, name can be anything
		car.add("Totyota");                                  // in hashset all the values must be unique/different, where as in hashmap we can use same.duplicate value. (p.t.o)
		car.add("Pulsar");										// But if we use same/duplicate value dn it won't print the duplicate value. just print 1 time whether the value is 2 or more times same.
		car.add("Suzuki");
		System.out.println("My car names are : " + car);
		
		HashSet <String> bus = new HashSet <String> ();
		bus.add("GreenLine");
		bus.add("SohagParibahan");
		bus.add("Vamos");
		System.out.println("The bus name will be : " + bus);
		
		HashSet <Integer> sportsCar = new HashSet <Integer>();
		
		sportsCar.add(420);
		sportsCar.add(840);
		sportsCar.add(1060);
		System.out.println("My sports car's speed limit is : " + sportsCar);
		
		
	    HashSet<Integer> upskill = new	HashSet<Integer>(); // here upskill is hash-set name, name can be anything
	    upskill.add(11);                                         // hashmap & hashset is somewhat same concept
	    upskill.add(22);
	    upskill.add(33);
	    System.out.println("The best part is : " + upskill );
	    
//	     HASH-TABLE                                                  
	    
	    Hashtable<String, String> america = new Hashtable<String, String> (); // here america is the hash-table name
	    america.put ("Choumuhuni", "Chorjobbor");									// hashtable & hashmap is somewhat same concept
	    america.put ("Sonapur", "Maijdee");
	    america.put ("Noakhali", "Sonaimuri");
	    System.out.println("The name will be : " + america.get("Noakhali"));
		
	    Hashtable<Integer, Integer> downskill = new Hashtable<Integer, Integer> ();    // here downskill is the hash-table name
	    downskill.put (1,2);																// hash table is synchronized
	    downskill.put (3,4);
	    downskill.put (5,6);
	    System.out.println("The hash-table number will be : " + downskill.get(5));
	    
	    
	    Hashtable <String, Integer> goodNight = new Hashtable <String, Integer> ();  // here goodNight is the hash-table name
	    goodNight.put("Silvi", 100);
	    goodNight.put("Samir", 200);
	    goodNight.put("We", 300);
	    System.out.println("We are together : " + goodNight.get("We"));
	    
	    Hashtable <String, String> googMorning = new Hashtable <String, String>();
	    googMorning.put ("We", "Three");
	    googMorning.put ("us", "Four");
	    googMorning.put ("our", "Five");
	    googMorning.put ("your", "Six");
	    System.out.println("Total we are how much : " + googMorning.get("your"));
		}
		
	}


