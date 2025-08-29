package com.generics.example;

@FunctionalInterface
interface Test<T> {
	boolean test(T num);
}

public class LambdaUsingGenerics {

	void TestEven(Test<Integer> obj) {
		System.out.println(obj.test(60));
		System.out.println(obj.test(21));
	}

	void TestOdd(Test<Integer> obj) {
		System.out.println(obj.test(61));
		System.out.println(obj.test(60));
	}

	void TestSize(Test<String> obj) {
		System.out.println(obj.test("Sharath"));
		System.out.println(obj.test("sh"));
	}

	void TestArmstrong(Test<Integer> obj) {
		System.out.println(obj.test(153));
		System.out.println(obj.test(123));
	}

	void TestPrimeNumber(Test<Integer> obj) {
		System.out.println(obj.test(2));
		System.out.println(obj.test(4));
	}

	void TestPalindrome(Test<Integer> obj)
	{
		System.out.println(obj.test(121));
		System.out.println(obj.test(122));
	}

	void TestLeapYear(Test<Integer> obj) {
		System.out.println(obj.test(2));
		System.out.println(obj.test(2019));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaUsingGenerics obj = new LambdaUsingGenerics();
		obj.TestEven((a) -> a % 2 == 0);
		obj.TestOdd((a) -> a % 2 != 0);
		obj.TestSize((a) -> a.length() >= 3);
		obj.TestArmstrong((a) -> {
			int temp = a;
			int sum = 0;
			while (a > 0) {
				int r = a % 10;
				sum = sum + (r * r * r);
				a = a / 10;
				if (sum == temp)
					return true;
			}
			return false;
		});
		
		obj.TestPrimeNumber((a) -> {
			if (a <= 1)
				return false;
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0)
					return false;
			}
			return true;

		});
		
		
		obj.TestPalindrome((num)-> {
			int temp = num;
			int test = 0;
			while(num>0)
			{
				int r = num % 10;
				test = (test*10)+r;
				num = num/10;
			}
			if(temp == test)
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		});
		
		obj.TestLeapYear((a) -> {
			if (a % 4 == 0) {
				if (a % 100 == 0) {
					return a % 400 == 0;
				} else {
					return true;
				}
			}
			return false;
		});

	}

}
