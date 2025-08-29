package com.decisionmaking.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ifelse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A value:");
		int a = Integer.parseInt(obj.readLine());
		System.out.println("Enter B value:");
		int b = Integer.parseInt(obj.readLine());
		if(a<b)
		{
			System.out.println("A value is Smaller than B");
		}
		else
		{
			System.out.println("A is not less than B");
		}
		

	}

}
