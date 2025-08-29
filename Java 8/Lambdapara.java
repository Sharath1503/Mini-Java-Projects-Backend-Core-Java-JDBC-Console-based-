package com.java8.example;

@FunctionalInterface
interface Arith {
	int Add(int a, int b);
}

public class Lambdapara {

	void Operate(Arith obj) {
		System.out.println(obj.Add(10, 12));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambdapara obj = new Lambdapara();
		obj.Operate((a, b) -> {
			return a + b;
		});
		obj.Operate((a, b) -> {
			return a - b;
		});
		obj.Operate((a, b) -> {
			return a * b;
		});
		obj.Operate((a, b) -> {
			return a / b;
		});
		obj.Operate((a, b) -> {
			return a % b;
		});

	}

}
