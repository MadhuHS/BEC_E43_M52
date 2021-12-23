package com.jspiders.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.PriorityQueue;



class Mainclass2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

		pq1.add(6);
		pq1.add(1);
		pq1.add(3);
		pq1.add(4);
		pq1.add(2);
		pq1.add(5);
		pq1.add(7);
		pq1.add(3);
		pq1.add(10);

		System.out.println("size : " + pq1.size());
		while (pq1.size() != 0) {
			System.out.println(pq1.poll());
		}
		System.out.println("size : " + pq1.size());

		DescOrder d1 = new DescOrder();

		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(d1);

		pq2.add(6);
		pq2.add(1);// d1.compare(1,6)
		pq2.add(3);
		pq2.add(4);
		pq2.add(2);
		pq2.add(5);
		pq2.add(7);
		pq2.add(3);
		pq2.add(10);

		while(pq2.size() > 0)
		{
			System.out.println(pq2.poll());
		}

	}
}
