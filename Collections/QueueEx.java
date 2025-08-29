package com.vector.ex;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue <String> q = new PriorityQueue<String>();
		q.add("1234");
		q.add("9.549859");
		q.add("lavan");
		q.add("Somu");
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		q.add("e");
		q.add("f");
		System.out.println(q.peek());
		System.out.println(q.size());
		// printing the elements
		for (Object name : q) {
			System.out.println(name);
		}
		Queue<String> q2 = new PriorityQueue<String>();
		q2.add("element1");
	    q2.add("element2");
		q.addAll(q2);
		System.out.println(q);
		//removing elements from collection using element name and index
		
		q.remove(1);
		q.remove("lavan");
		System.out.println("After removing data:"+q);
		//removing name data from name2
		
		q2.removeAll(q);
		System.out.println("After removing q from q2:"+q2);
		
		System.out.println(q.peek());
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.contains("Sharath"));
	}

}
