package com.mfino.Oopsconcept;

public class Testcar {

	public static void main(String[] args ){
		
		// Static polymerphism -- compiletime polymerphism
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.fuel();
		System.out.println("**********");
		Car c=new Car();
		c.start();
		c.stop();
		c.fuel();
		//c.sasftyCar(); -- cannot access the child method
		
		
		//Top Casting
		Car c1=new Bmw(); // child class obj can be referencce of the paraent class reference varaible ----Dynamic poly 
		c1.fuel();
		c1.start();
		c1.stop();
		
		
		
		// down casting 
		Bmw b1=(Bmw) new Car(); //Bmw --- Stop java.lang.ClassCastException
		
		
	}
}
