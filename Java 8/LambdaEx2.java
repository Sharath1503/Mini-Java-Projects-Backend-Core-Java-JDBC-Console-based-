package com.java8.example;

interface Abc {
	String ex(String name);
}
public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = (name)->{return"name ="+name;};
		System.out.println(obj.ex("Sharath"));
		Abc obj1 = (name)->{return"name ="+name;};
		System.out.println(obj1.ex("Somu"));
		Abc obj2 = (name)->{return"name ="+name;};
		System.out.println(obj2.ex("Shiva"));
		Abc obj3 = (name)->{return"name ="+name;};
		System.out.println(obj3.ex("Shiva"));
	}

}



















