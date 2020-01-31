package com.mfino.collections;

public class EncapsulationClassTwo {

	public static void main(String[] args){
		EncapsulationClassOne obj=new EncapsulationClassOne();
		obj.setAge(25);
		obj.setName("Narayana");
		System.out.println("my age  is "+ obj.getAge());
		System.out.println("my name is "+ obj.getName());
	}
}
