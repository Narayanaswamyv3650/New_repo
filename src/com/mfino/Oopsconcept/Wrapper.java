package com.mfino.Oopsconcept;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "100";

		System.out.println(s + 20);
		// data conversion to int
		Integer i = Integer.parseInt(s);
		System.out.println(i + 20);

		// String to Double conversion
		String y = "22.98";
		Double d = Double.parseDouble(y);
		System.out.println(d + 20.21);
		// String to char conversion not possiable
		// String to boolen conversion
		String k = "true";
		Boolean l = Boolean.parseBoolean(k);
		System.out.println(l);

		// int to string conversion
		int j=200;
		System.out.println(j);
		String m=String.valueOf(j);
		System.out.println(j+12);		
		System.out.println("**********************");
		
		// 
		String  g="200H";
		System.out.println(g);
		Integer n=Integer.valueOf(g);
		System.out.println(j+12);	
		
		
		
		
		
		
		
	}

}
