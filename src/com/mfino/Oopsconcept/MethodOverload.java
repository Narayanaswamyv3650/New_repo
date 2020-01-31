package com.mfino.Oopsconcept;

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload obj=new MethodOverload();
		obj.sum(10, 20);
		obj.sum();
		obj.sum1(10);
	}

	
	// when the method name is same with different argumnets or different args with in the same class
	// you can not create method inside method 
	// duplicate -- same method name with same number of args not allowed & if same data types will not allowed 
	
	void sum() {
		System.out.println("zero method");
	}

	void sum1(int i) {// one input
		System.out.println("one method");
		System.out.println(i);
	}
	void sum(int i , int k){ // two intput method
		System.out.println("two method");
		System.out.println(i+k);
	}
}
