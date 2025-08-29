package com.scanner.example;
 import java.util.Scanner;
 
public class ScannerClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(num);
		System.out.println("Enter a float number");
		float no = sc.nextFloat();
		System.out.println(no);
		System.out.println("Enter a double number");
		double d = sc.nextDouble();
		System.out.println(d);
		System.out.println("Enter a char");
		char s = sc.next().charAt(0);
		System.out.println(s);
		System.out.println("Enter a boolean value");
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		

	}

}
