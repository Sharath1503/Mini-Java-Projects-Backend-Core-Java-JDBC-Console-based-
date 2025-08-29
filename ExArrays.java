package com.example.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExArrays {
	public static void main(String[] args) throws IOException {
        String sname;
		String group;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student name:");
		sname = obj.readLine();
		System.out.println("Enter Group:");
		group = obj.readLine();
		
		System.out.println("Enter no. of Subjects");
		int n = Integer.parseInt(obj.readLine());
		String subjects[] = new String[n];
		for(int i =0; i<n;i++)
		{
			System.out.println("Enter"+(i+1)+" Subject:");
			subjects[i] = obj.readLine();
		}
		System.out.println(sname);
		System.out.println(group);
		
		for(int i =0;i<subjects.length;i++)
		{
			System.out.println(subjects[i]);
		}
        }

}
