package com.constructor.example;
class parent26
{
	void display()
	{
		System.out.println("This is Parent Class");
	}
}
class Child15 extends parent26
{
	void display()
	{
		System.out.println("This is Child Class");
	}
	void show()
	{
	  super.display();
	  display();
	}
}

public class SuperMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child15 ss = new Child15();
		ss.show();

	}

}
