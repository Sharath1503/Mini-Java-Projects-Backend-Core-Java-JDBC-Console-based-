package com.threads.example;

class Print {

	synchronized void PrintThreads(int n) {
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

class Class3 extends Thread {
	Print p;

	public Class3(Print p) {
		this.p = p;
	}

	@Override
	public void run() {
		p.PrintThreads(1);
	}
}

class Class2 extends Thread {
	Print p;

	public Class2(Print p) {
		this.p = p;
	}

	@Override
	public void run() {
		p.PrintThreads(11);
	}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p = new Print();
		Class3 t1 = new Class3(p);
		Class2 t2 = new Class2(p);
		t1.start();
		t2.start();

	}

}
