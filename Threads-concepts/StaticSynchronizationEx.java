package com.threads.example;

class Printtt {

	static synchronized void PrintThreadss(int n) {
		for (int i = 0; i <= 9; i++) {
			System.out.println(i + n);
		}
	}
}

class Class6 extends Thread {
	@Override
	public void run() {
		Printtt.PrintThreadss(1);
	}
}

class Class7 extends Thread {
	@Override
	public void run() {
		Printtt.PrintThreadss(11);
	}
}

public class StaticSynchronizationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class6 t1 = new Class6();
		Class7 t2 = new Class7();
		t1.start();
		t2.start();

	}

}
