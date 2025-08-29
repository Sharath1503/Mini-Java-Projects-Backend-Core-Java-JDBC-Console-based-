package com.java8.example;


@FunctionalInterface
interface Arithmetic1{
	
	boolean TestEven(int num);
}

public class FunctionalInterfaces {
	
	public static void main(String [] args) {
		
		Arithmetic1 obj = (num)-> {
			if(num%2 == 0)
				return true;
			else
				return false;
		};
		System.out.println(obj.TestEven(25));
		}
	}
	
