package com.mfino.Oopsconcept2;

public class TestBank {
	public static  void main(String[] args) {
  // UsBanKinterface.minbal=200;
		// UsBanKinterface us=new UsBanKinterface();// cannot create the obje to
		// the interface
		HSBCBank hs = new HSBCBank();
		hs.debit();
		hs.credit();
		hs.externaltrn();
		hs.transferMoney();

		UsBanKinterface us = new HSBCBank();
		us.credit();
		// us.internalTrn(); we cannot access child class method

	}
}
