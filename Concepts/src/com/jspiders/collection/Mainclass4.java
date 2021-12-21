package com.jspiders.collection;

import java.util.HashMap;

class Mainclass4 
{
	public static void main(String[] args) 
	{
	   HashMap<String,Long> contacts = new HashMap<String, Long>();
	   
	   contacts.put("C1",98764543210l);//insert
	   contacts.put("C2",98764543210l);//insert
	   contacts.put(null,82681828192l);//insert
	   
	   Long mob;
	   mob = contacts.get("C1");//read one data
	   System.out.println("C1 --> "+mob);
	   
	   contacts.put("C1",8989897661l);//update
	   
	   mob = contacts.get("C1");//read one data
	   System.out.println("C1 --> "+mob);
	   
	   
	   mob = contacts.get("C2");//read one data
	   System.out.println("C2 --> "+mob);
	   
	   mob = contacts.get(null);//read one data
	   System.out.println("null --> "+mob);
	}
}
