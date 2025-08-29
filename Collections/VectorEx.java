package com.vector.ex;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector(); // creating object for collection

		// checking the capacity of collection
		System.out.println("capacity before adding elements:" + v1.capacity());
		// checking the size of collection
		System.out.println("size before adding elements:" + v1.size());

		// adding elements to the object
		v1.add("Sharath");
		v1.add("lavan");
		v1.add("somuu");
		v1.add("Shiva");
		v1.add("a");
		v1.add("b");
		v1.add("c");
		v1.add("d");
		v1.add("e");
		v1.add("f");
		v1.add("g");
		v1.add("h");
		v1.add("i");

		// adding element to the particular index
		v1.add(2, "Venkat");

		// printing the elements
		for (Object name : v1) {
			System.out.println(name);
		}
		// checking the capacity of collection
		System.out.println("capacity after adding elements:" + v1.capacity());
		// checking the size of collection
		System.out.println("size after adding elements:" + v1.size());
		
		
		Vector v2 = new Vector();
		v2.add("element1");
		v2.add("element2");
		v2.addAll(0,v1);
		System.out.println(v2);
		
		//removing elements from collection using element name and index
		
		v1.remove(1);
		v1.remove("lavan");
		System.out.println("After removing data:"+v1);
		
		//removing v1 data from v2
		
		v2.removeAll(v1);
		System.out.println("After removing v1 from v2:"+v2);
		
		//updating data
		v1.set(4, "Eswar");
		System.out.println("After updating: "+v1);
		
		//retrieving data
		System.out.println(v1.get(4));
		
		

	}
	
	

}
