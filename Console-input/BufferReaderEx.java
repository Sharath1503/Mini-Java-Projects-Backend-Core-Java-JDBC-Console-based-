package com.scanner.example;
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Name");
		String name = br.readLine();
		System.out.println(name);
		System.out.println("Enter a Number");
		int no = Integer.parseInt(br.readLine());
		System.out.println(no);
		System.out.println("Enter a Float Number");
		float f = Float.parseFloat(br.readLine());
		System.out.println(f);
		System.out.println("Enter a Char");
		char c = (char)br.readLine().charAt(0);
		System.out.println(c);
		System.out.println("Enter a Double Number");
		double d = Double.parseDouble(br.readLine());
		System.out.println(d);
		System.out.println("Enter a boolean value");
		boolean bo = Boolean.parseBoolean(br.readLine());
		System.out.println(bo);
		
		
		

	}

}
