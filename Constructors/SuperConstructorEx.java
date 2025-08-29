package com.constructor.example;
class Parent1526
{
	public Parent1526()
	{
		System.out.println("This is Parent Class Constructor");
	}
public Parent1526(int a, int b)
{
	System.out.println(a);
	System.out.println(b);
}
}

class child2615 extends Parent1526
{
	public child2615()
	{
		super(10,20);
		System.out.println("This is Child Class Constructor");
	}
}
public class SuperConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child2615 vs = new child2615();

	}

}
