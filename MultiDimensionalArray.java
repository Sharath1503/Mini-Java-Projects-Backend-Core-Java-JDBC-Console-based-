package com.example.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionalArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Values:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
			
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

		}
	}
