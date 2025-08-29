package com.example.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySortingEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.of values:");
		int n = Integer.parseInt(br.readLine());
		int values[] = new int[n];
		for(int i =0; i<n;i++)
		{
			System.out.println("Enter"+(i+1)+"Element:");
			values[i] = Integer.parseInt(br.readLine());
		}
		int temp;
		for (int i = 0;i<values.length;i++)
		{
			for(int j=i+1;j<values.length;j++)
			{
				if(values[i]>values[j])
				{
					temp = values[i];
					
					
					values[i]=values[j];
					values[j]=temp;
					
				}
				
			}
		}
		for(int value:values)
		{
			System.out.println(value);
		}

	}

}
