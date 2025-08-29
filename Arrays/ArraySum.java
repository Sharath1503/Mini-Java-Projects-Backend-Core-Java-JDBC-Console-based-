package com.example.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySum {

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
		int sum=0;
		for(int i=0;i<values.length;i++)
		{
			sum = sum + values[i];
		}
		System.out.println("Sum = "+sum);
		
		double avg;
		avg = sum/(float)values.length;
		System.out.println("Average = "+avg);

	}

}
