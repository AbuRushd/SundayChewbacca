package com_upskill_java_5;

public abstract class AbstractClass {   // after creating class just add "abstract" word after public and before class.

	public void brand () {
		String brand = "Audi";
	}
		
	public void color () {
		String color = "Black";
	}
	
	public abstract void iDoor();
	
	public abstract void iSeat();
	}


// in abstract method we have both regular method & abstract method (p.t.o.)
// but in interface we have only abstract method