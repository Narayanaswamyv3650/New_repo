package com.mfino.javabasics;

public class ArrayConcept { 


	public static void main(String[] args ){
	// arry : to store the similar data type values in the variable 
		// all below are called as one dimentional array 
		//dis adv --- 1. size is fixed -- static array -- to over come we use collections 
					//2. store only similar data types  --to over come this we use object array 
		int i[]= new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		System.out.println(i[2]);
		System.out.println(i[3]);
				
	for(int j=0;j<i.length;j++){
	System.out.println(i[j]);	
	}
	//2. double arrary 
	double d[]= new double[3];
	d[0]=12.12;
	d[1]=123.33;
	d[2]=23.3;
	System.out.println(d[2]);	
	System.out.println("****************");
	//3. char array 
	//4. boolean array 
	//5.string array
	String s[]=new String[12];
	s[0]="Narayana";
	System.out.println(s.length);
	//6.Object array -- The Object class is the parent class of all the classes in java by default.
	
	Object obj[]=new Object[8];
	obj[0]="narayana";
	obj[1]=23;
	obj[2]=23.9;
	
	System.out.println(obj[1]);
	System.out.println(obj[2]);
	System.out.println(obj.length);
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
