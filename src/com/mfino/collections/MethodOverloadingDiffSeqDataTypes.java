package com.mfino.collections;

public class MethodOverloadingDiffSeqDataTypes {

	public void methodOne(int x, String y){
		System.out.println(y);
		
	}
	public void methodOne(String y, int x){
		System.out.println(y);
	}
	public static void main(String[] args){
		MethodOverloadingDiffSeqDataTypes obj=new MethodOverloadingDiffSeqDataTypes();
		obj.methodOne(1, "Int and String");
		obj.methodOne("String and Int", 2);
	}
}
