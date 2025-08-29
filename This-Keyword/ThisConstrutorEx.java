package com.thiskeyword.ex;

public class ThisConstrutorEx {
	
	int a;
	String d;
	
	public ThisConstrutorEx()
	{
		System.out.println("This is Constructor Ex");
	}
	
	public ThisConstrutorEx(int a, String d)
	{
		this();
		this.a=a;
		this.d=d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstrutorEx c = new ThisConstrutorEx(26, "SHARATH");
		System.out.println(c.d);
		System.out.println(c.a);
	}

}
