package com.constructor.example;

public class ParameterizedConEx {
	
	String Sname;
	int srollno;
	public ParameterizedConEx()
	{
		
	}
	
	public ParameterizedConEx (String Student_Name, int Student_rollno)
	{
		this.Sname = Student_Name;
		this.srollno = Student_rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConEx obj = new ParameterizedConEx("Sharath", 15);
		System.out.println(obj.Sname);
		System.out.println(obj.srollno);

	}

}
