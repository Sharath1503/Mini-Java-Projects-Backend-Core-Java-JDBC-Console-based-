package com.example.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx2 {
	void ArrayDisplay(String acc[])
	{
		for(String acc1:acc)
		{
			System.out.println(acc1);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String pname;
		int page;
		String gender;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		pname = br.readLine();
		System.out.println("Enter age:");
		page = Integer.parseInt(br.readLine());
		System.out.println("Enter Gender:");
		gender = br.readLine();
		
		System.out.println("Enter no. of accounts");
		int n = Integer.parseInt(br.readLine());
		String accounts[] = new String[n];
		for(int i =0; i<n;i++)
		{
			System.out.println("Enter"+(i+1)+"Account:");
			accounts[i] = br.readLine();
			
		}
		System.out.println(pname);
		System.out.println(page);
		System.out.println(gender);
		
		ArrayEx2 obj = new ArrayEx2();
		obj.ArrayDisplay(accounts);

	}

}
