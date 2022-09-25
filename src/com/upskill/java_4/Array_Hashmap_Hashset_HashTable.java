package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		// Array store multiple data using index
		// (in array we do not need to create any sub-method. we just need to work under main method)
		int age = 30;														// Variable
		
		int [] ageChewbacca = new int [] {24, 45, 29, 35, 33, 28};			// Array   here we used integer, here age Chewbacca is the array name
		//Array Index                      0   1   2   3   4   5
		System.out.println("Student Age : " + ageChewbacca [0] );           
	
	
		String [] nameChewbacca = new String [] {"Rushdi", "Zahid", "Nerob", "Pappu", "Naim"};  // here we used string, here nameChewdacca is the array name
		//Array Index                               0        1          2       3       4   
        System.out.println("Student Name : " + nameChewbacca[0]);
        System.out.println("Total Student : " + nameChewbacca.length);      // this ".length" is used to show the total number of students
        
        // Multi-Dimentional Array
        
        int [][] ageChewbacca2D = {{24, 45, 29, 35, 33, 28},
        		                     {24, 45, 29}};
        // Multi-Dimentional Array Index [0][0]  [0][2]  [0][2]  [0][3]  [0][4]  [0][5]
        //                                [1][0]  [1][1]  [1][2]
        System.out.println("Student Age 2D : " + ageChewbacca2D[0][2]);
        
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
        // Hashmap store multiple data using key-value pair, Implementation of Map interface
        HashMap<String, Integer> Student = new HashMap <String, Integer> ();
        Student.put("Rushdi", 24);
        Student.put("Zahid", 45);
        Student.put("Nerob", 29);
        Student.put("Pappu", 35);
        Student.put("Naim", 33);
        System.out.println("Student Age: " + Student.get("Rushdi"));
        
        HashMap<String, String> Capital = new HashMap <String, String> ();
        Capital.put ("BD", "Dhaka");
        Capital.put ("India", "Mumbai");
        System.out.println("Capital City : " + Capital.get("India"));
        
      //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
        // Hashset store unordered collection containing unique value, Implementation of set interface
        HashSet<String> car = new HashSet<String>();
        car.add ("Toyota");
        car.add ("Audi");
        car.add("BMW");
        System.out.println("Car : " + car);
        
      /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // HashTable store multiple data using key-value pair, but is synchronized (only one thread can be modified)
        Hashtable<String, String> Region = new Hashtable<String, String> ();  // (Hashtable is similar to hashset)
        Region.put ("BD", "Asia");
        Region.put ("India", "Mumbai");
        System.out.println("Region City : " + Region.get("India"));
        
        }
}


