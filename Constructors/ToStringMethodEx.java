package com.constructor.example;

public class ToStringMethodEx {
	int a;
	int b;
	

	public ToStringMethodEx(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	

	@Override
	public String toString() {
		return "a value =" + a + ",\nb value =" + b + "";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringMethodEx d = new ToStringMethodEx(10, 20);
		System.out.println(d);

	}

}
