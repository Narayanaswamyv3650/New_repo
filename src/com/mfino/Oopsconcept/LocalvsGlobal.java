package com.mfino.Oopsconcept;

public class LocalvsGlobal {
	// gloable variable
	String name = "Nara";
	int age = 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;// local variable
		LocalvsGlobal obj=new LocalvsGlobal();
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		
		System.out.println(i);

	}

	public void method1() {
		int i = 10;
		int j = 20;
		int k = i + j;
	}
}
