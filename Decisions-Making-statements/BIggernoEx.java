package com.decisionmaking.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BIggernoEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A value:");
		int a = Integer.parseInt(obj.readLine());
		System.out.println("Enter B value");
		int b = Integer.parseInt(obj.readLine());
		System.out.println("Enter c value");
		int c = Integer.parseInt(obj.readLine());
		if(a>=b && a>c)
		{
			System.out.println("A value is Bigger");
		}
		else if (b>=a && b>c)
		{
			System.out.println("B value is Bigger");
		}
		else
		{
			System.out.println("C value is Bigger");
		}
		
	}

}
