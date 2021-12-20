package com.jspiders.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class DescOrder implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		int res = i2 - i1;
		return res;
	}

}

class Mainclass {
	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<Integer>();

		ts1.add(6);
		ts1.add(1);
		ts1.add(3);
		ts1.add(4);
		ts1.add(2);
		ts1.add(5);
		ts1.add(7);
		ts1.add(3);
		ts1.add(10);

		Iterator<Integer> i1 = ts1.iterator();

		while (i1.hasNext() == true) {
			System.out.println(i1.next());
		}

		System.out.println("---------------------");
		
		DescOrder d1 = new DescOrder();
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(d1);

		ts2.add(6);
		ts2.add(1);//d1.compare(1,6)
		ts2.add(3);
		ts2.add(4);
		ts2.add(2);
		ts2.add(5);
		ts2.add(7);
		ts2.add(3);
		ts2.add(10);

		Iterator<Integer> i2 = ts2.iterator();

		while (i2.hasNext() == true) {
			System.out.println(i2.next());
		}

	}
}
