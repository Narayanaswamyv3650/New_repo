package com.mfino.collections2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("ravi");
		list.add("king");
		list.add("ravi");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
