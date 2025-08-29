package com.threads.example;

class Printt {

	 void PrintThreads(int n) {
		 synchronized(this) {
		for (int i = 0; i < 9; i++) {
			System.out.println(i + n);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		 }
	}
	 
}

class Class4 extends Thread {
	Printt p;

	public Class4(Printt p) {
		this.p = p;
	}

	@Override
	public void run() {
		p.PrintThreads(1);
	}
}

class Class5 extends Thread {
	Printt p;

	public Class5(Printt p) {
		this.p = p;
	}

	@Override
	public void run() {
		p.PrintThreads(11);
	}
}

public class SynchblockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printt p = new Printt();
		Class4 t1 = new Class4(p);
		Class5 t2 = new Class5(p);
		t1.start();
		t2.start();

	}

}

