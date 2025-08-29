package com.example.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx3 {
	void FindMin(int num[])
	{
		int min = num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]<=min)
			{
				min=num[i];
			}
		}
		System.out.println("Minimum value:"+min);
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Elements:");
		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter"+(i+1)+" Element:");
			num[i] = Integer.parseInt(br.readLine());
		}
		ArrayEx3 obj = new ArrayEx3();
		obj.FindMin(num);
		

	}

}
