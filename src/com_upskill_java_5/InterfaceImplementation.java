package com_upskill_java_5;

public class InterfaceImplementation implements Interface {

	public static void main(String[] args) {
		
		InterfaceImplementation obj = new InterfaceImplementation();				// iDoor			// void type
		obj.iDoor();																					// void type

		System.out.println(obj.iWheel());											// iWheel			// return type
		
		System.out.println(obj.iEngine());											// iEngine			// return type
		
		obj.iSeat();  																// iSeat			// void type
	}

	@Override
	public void iDoor() {
		System.out.println("4 doors");	
	}

	@Override
	public String iWheel() {	
		return "4 wheel" ;
	}

	@Override
	public String iEngine() {
		return "2 liter";
	}

	@Override
	public void iSeat() {		
		System.out.println("5 seats");
	}

}
