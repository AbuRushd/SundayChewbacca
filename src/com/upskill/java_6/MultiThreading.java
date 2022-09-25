package com.upskill.java_6;

public class MultiThreading {

	/* Multithreading is a Java feature that allows concurrent (repetition) execution of two or more parts of a program. (multithreading means java is doing multi-tasking or different tasks at a time)
	 
	 Threads can be created by using two mechanisms:
	 
	 	1. Extending the thread class
	 	2. Implementing the Runnable Interface */
	 
	public static void main(String[] args) {
	
		int n = 2;
		
		for (int i = 0; i<n; i++) {
			MultiThreadingDemo obj = new MultiThreadingDemo();
			obj.start();
			
			Thread obj2 = new Thread (new MultiThreadingDemo2());
			obj2.start();
		}

	}

}
class MultiThreadingDemo extends Thread {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

class MultiThreadingDemo2 implements Runnable {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}