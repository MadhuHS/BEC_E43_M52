package com.jspiders.collection;

import java.util.LinkedList;

class Mainclass3 {
	public static void main(String[] args) 
	{
		LinkedList<Integer> pq1 = new LinkedList<Integer>();

		pq1.add(6);
		pq1.add(1);
		pq1.add(3);
		pq1.add(4);
		pq1.add(2);
		pq1.add(5);
		pq1.add(7);
		pq1.add(3);
		pq1.add(10);
		
		
		for (int i = 0; i < pq1.size(); i++) 
		{
		   System.out.println(pq1.get(i));	
		}

		
		//QUEUE
		System.out.println("size : " + pq1.size());
		while (pq1.size() != 0) {
			System.out.println(pq1.poll());
		}
		System.out.println("size : " + pq1.size());


	}
}
