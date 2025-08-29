package com.vector.ex;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> name = new LinkedList<String>();
		name.add("Sharath");
		name.add("1234");
		name.add("9.549859");
		name.add("lavan");
		name.add("Somu");
		name.add("a");
		name.add("b");
		name.add("c");
		name.add("d");
		name.add("e");
		name.add("f");
		name.add("g");
		name.add("h");
		name.add("i");
		System.out.println(name);
		// adding element to the particular index
				name.add(2, "Venkat");

				// printing the elements
				for (Object names : name) {
					System.out.println(names);
				}
				// checking the size of collection
				System.out.println("size after adding elements:" + name.size());
					
				LinkedList<String> name2 = new LinkedList<String>();
					name2.add("element1");
					name2.add("element2");
					name2.addAll(0,name);
					System.out.println(name);
					
					//removing elements from collection using element name and index
					
					name.remove(1);
					name.remove("lavan");
					System.out.println("After removing data:"+name);
					
					//removing name data from name2
					
					name2.removeAll(name);
					System.out.println("After removing v1 from v2:"+name2);
					
					//updating data
					name.set(4, "Eswar");
					System.out.println("After updating: "+name);
					
					//retrieving data
					System.out.println(name.get(4));
					
					System.out.println(name.contains("Sharath"));

		

	}

}
