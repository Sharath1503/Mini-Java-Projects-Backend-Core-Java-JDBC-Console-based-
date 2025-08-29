package com.switchh.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch1Ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.division");
		System.out.println("5.Modulus");
		System.out.println("\nEnter a Number to perform Operations:");
		int n = Integer.parseInt(obj.readLine());
		switch (n) {
		case 1:
			System.out.println("Enter first Number:");
			int a = Integer.parseInt(obj.readLine());
			System.out.println("Enter second Number:");
			int b = Integer.parseInt(obj.readLine());
			System.out.println("Result =" + (a + b));
			break;
		case 2:
			System.out.println("Enter first Number:");
			int a1 = Integer.parseInt(obj.readLine());
			System.out.println("Enter second Number:");
			int b1 = Integer.parseInt(obj.readLine());
			System.out.println("Result =" + (a1 - b1));
			break;
		case 3:
			System.out.println("Enter first Number:");
			int a2 = Integer.parseInt(obj.readLine());
			System.out.println("Enter second Number:");
			int b2 = Integer.parseInt(obj.readLine());
			System.out.println("Result =" + (a2 * b2));
			break;
		case 4:
			System.out.println("Enter first Number:");
			int a3 = Integer.parseInt(obj.readLine());
			System.out.println("Enter second Number:");
			int b3 = Integer.parseInt(obj.readLine());
			System.out.println("Result =" + (a3 / b3));
			break;
		case 5:
			System.out.println("Enter first Number:");
			int a4 = Integer.parseInt(obj.readLine());
			System.out.println("Enter second Number:");
			int b4 = Integer.parseInt(obj.readLine());
			System.out.println("Result =" + (a4 % b4));
			break;
		default:
			System.out.println("Enter valid number to perform operations");
		}

	}

}
