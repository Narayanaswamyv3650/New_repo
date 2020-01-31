package com.mfino.javabasics;

public class IfElse {
public static void main(String[]args){
	int l=30;
	int m=20;
	
	if(m>l){
		System.out.println("l is grater than m");
	}
	else{
		System.out.println("m is less than ls");
	}
	//comparision Operators 
	//> < >= <=  !=
	int c=40;
	int d=80;
	if(c==d){
		System.out.println("c equals d");
	}
	else{
		System.out.println("both are not equal ");
	}
	
	int a1=100;
	int b1=400;
	int c1=300;
	if(a1>b1 & a1>c1){
		System.out.println("a1 is hight ");
	}
	else if(b1>c1){
		System.out.println("b1 is hight");
	}
	else {
		System.out.println("c1 is hight");
	}
}
}
