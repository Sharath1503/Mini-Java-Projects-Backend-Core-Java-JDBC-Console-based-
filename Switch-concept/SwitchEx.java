package com.switchh.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a day no. in a week:");
		int dayno = Integer.parseInt(obj.readLine());
		switch(dayno)
		{
		case 1 : System.out.println("Sunday");
		         break;
		case 2 : System.out.println("Monday");
		         break;
		case 3 : System.out.println("Tuesday");
		         break;
		case 4 : System.out.println("Wenesday");
                 break;
		case 5 : System.out.println("Thursday");
                 break;
		case 6 : System.out.println("Friday");
                 break;
		case 7 : System.out.println("Saturday");
                 break;
        default : System.out.println("Enter a valid number between 1-7");
		}
		
	}

}
