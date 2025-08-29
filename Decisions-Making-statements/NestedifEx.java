package com.decisionmaking.ex;

public class NestedifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sname  = "Sharath";
		String pswd = "Shar1526";
		
		if(sname.equals("Sharath"))
		{
			if(pswd.equals("Shar156"))
			{
				System.out.println("Login Success");
			}
			else
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
