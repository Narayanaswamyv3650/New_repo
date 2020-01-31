package com.mfino.Oopsconcept2;

public class HSBCBank implements UsBanKinterface {

	// if a class implementing inteface then it mandatory to define/ overriden all the method in intercace
	
	public void debit() {
		System.out.println("hsbc -- debit ");
	}
	public void credit() {
System.out.println("hsbc -- credit ");
}

	public void transferMoney() {
		System.out.println("hsbc -- transfer  ");
	}

	public void internalTrn(){
		System.out.println("hsbc -- inter ");

	}
	public void externaltrn(){
		System.out.println("hsbc -- ext ");

	}
	
}
