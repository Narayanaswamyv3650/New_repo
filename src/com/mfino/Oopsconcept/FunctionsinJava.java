package com.mfino.Oopsconcept;

public class FunctionsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating obj for all non static ");
		FunctionsinJava obj=new FunctionsinJava();
		//one object will be creating
		obj.test();
		obj.pqr();
		obj.QAtest();
		//obj.AQtest(x y);
		
		double div =obj.AQtest(30, 10);
		System.out.println(div); 
		
		//main method is void never retuns the  value 
	}
	// Non Static methods

	public void test() {// return nothing
		System.out.println("nara");
	}

	public int pqr() {// return type is --int
		System.out.println("qatest");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public void QAtest() { /// retun type is --- string
		System.out.println("This is string");
		String s = "String selenium";
	}

	public double AQtest(int x, int y) {
		System.out.println("This is Double");
		int d = x / y;
		return d;

	}

}
