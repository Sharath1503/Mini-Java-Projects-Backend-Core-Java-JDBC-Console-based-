package com.java8.example;

interface Arithmetic {
	void Operations(int a, int b);
}
public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj = (a,b)->{System.out.println("Addition:"+(a+b));};
		obj.Operations(20, 10);
		Arithmetic obj1 = (a,b)->{System.out.println("Subtraction:"+(a-b));};
		obj1.Operations(20, 5);
		Arithmetic obj2 = (a,b)->{System.out.println("Multiplication:"+(a*b));};
		obj2.Operations(20, 10);
		Arithmetic obj3 = (a,b)->{System.out.println("Division:"+(a/b));};
		obj3.Operations(20, 5);

		
	}

}
