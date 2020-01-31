package com.mfino.Oopsconcept;

public class CallbyreferenceandbyValue {
	int p=50;
	int q=70;
	
	
	public static void main(String[] args) {
		CallbyreferenceandbyValue oj=new CallbyreferenceandbyValue();
	  int x=20;
	  int y=30;
	  oj.test(x, y); // call by value or pass by value
	  	
	  oj.p=50;
	  oj.q=60;
	  oj.swap(oj);

	  System.out.println(oj.p);
	  System.out.println(oj.q);
		//oj.test(10, 30);
		System.out.println(oj);
	}

	public int test(int a, int b) {
		a=30;
		b=40;
		int c = a + b;
		return c;
	}	
	
	// call by reference  , (in c location point called pointers )
	// but in java object references
	public void swap(CallbyreferenceandbyValue t)
	{
		int temp;
		temp=t.p; // 50
		t.p=t.q; //70
		t.q=temp; //50
	}
	
}
