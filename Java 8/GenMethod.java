package com.generics.example;

class Met {

	public <E> void PrintArray(E elements[]) {

		for (E element : elements) {
			System.out.println(element);
		}
	}

}

public class GenMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intArray[] = { 12, 23, 45, 67 };
		Met obj = new Met();
		obj.PrintArray(intArray);
		String StringArray[] = { "Sharath", "Somu" };
		obj.PrintArray(StringArray);

	}

}
