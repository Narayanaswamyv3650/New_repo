package com.mfino.collections2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Vector<String> list = new Vector<>();
		list.add("ravi");
		list.add("king");
		list.add("ravi");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
