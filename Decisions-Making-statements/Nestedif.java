package com.decisionmaking.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nestedif {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Username:");
		String sname = obj.readLine();

		if (sname.equals("Sharath")) {
			System.out.println("Enter Password:");
			String pass = obj.readLine();
			if (pass.equals("Shar1526")) 
			{
				System.out.println("Login Success");
			} else 
			{
				System.out.println("Incorrect Password");
			}
		} 
		else 
		{
			System.out.println("Incorrect Username");
		}

	}

}
