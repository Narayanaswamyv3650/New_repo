package com.mfino.Oopsconcept;

public class BreakExample {

	// one condition validate the inside loop the break statment stop the flow
	// then skip that flow
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 10; i++) { if (i < 7) { System.out.println(i);
		 * System.out.println("***************"); //break; }
		 * System.out.println(i); } }
		 */ System.out.println("Outer Loop ");
aa:
		for (int i = 1; i <= 3; i++) {
			System.out.println("inner loop");
			bb:
			for (int j = 1; j <= 3; j++) {
				cc:
				if (i == 2 && j == 2) {
					// using break statement inside the inner loop
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}