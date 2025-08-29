package com.java8.example;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Sharath";
		Optional<String> stringOptional = Optional.ofNullable(name);
//		System.out.println(stringOptional);
//		System.out.println(stringOptional.get());
		if(stringOptional.isPresent())
		{
			if(stringOptional.get().equals("Sharath"))
			{
				System.out.println("Login Success");
			}
			else System.out.println("Incorrect Username");
		}
		else System.out.println("Field SHoould not be Empty");

	}

}
