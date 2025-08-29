package com.generics.example;

import java.util.ArrayList;

class Arithmetic<T extends Number> {
	ArrayList<T> listobj = new ArrayList<T>();

	void Add(T obj) {
		listobj.add(obj);
	}

	void Display() {
		for (T t : listobj) {
			System.out.println(t);
		}
	}

}

public class WildcardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arithmetic<Integer> obj = new Arithmetic<Integer>();
		obj.Add(20);
		obj.Add(23);
		obj.Display();
		Arithmetic<Float> obj1 = new Arithmetic<Float>();
		obj1.Add(23.09f);
		obj1.Add(54.09f);
		obj1.Display();

	}

}
