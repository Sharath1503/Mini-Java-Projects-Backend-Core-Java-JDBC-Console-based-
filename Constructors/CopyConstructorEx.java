package com.constructor.example;

public class CopyConstructorEx {
	
	String Sname;
	int srollno;

	public CopyConstructorEx(String Sname, int srollno) {
		// TODO Auto-generated constructor stub
		this.Sname = Sname;
		this.srollno = srollno;
		
	}
	public CopyConstructorEx(CopyConstructorEx ce)
	{
		System.out.println(ce.Sname);
		System.out.println(ce.srollno);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructorEx ce = new CopyConstructorEx("Sharath", 15);
		CopyConstructorEx c = new CopyConstructorEx(ce);
		System.out.println(ce.Sname);
		System.out.println(ce.srollno);

	}

}
