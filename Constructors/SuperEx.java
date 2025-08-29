package com.constructor.example;

class Parent15
{
	int a = 10;
	int b = 20;
}

class Child26 extends Parent15
{
	int a = 1;
	int b = 2;
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
		System.out.println(super.b);
		
	}
}

public class SuperEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child26 s = new Child26();
		s.display();

	}

}
