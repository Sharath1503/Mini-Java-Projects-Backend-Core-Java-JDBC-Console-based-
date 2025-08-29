package com.InterThread.example;

class Bank {
	int totalamount = 10000;
	synchronized void withdraw(int WDAmount) {
		System.out.println("Withdraw Running..");
		if (totalamount < WDAmount) {
			System.out.println("Insufficient Funds");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(totalamount);
				totalamount = totalamount - WDAmount;
				System.out.println("Withdraw Success..");
			}
		}
		}

	synchronized void Deposit(int DAmount) {
		System.out.println("Deposit Running..");

		totalamount = totalamount + DAmount;
		System.out.println("Deposit Success...");
		notify();
	}
}

	class Thread1 extends Thread {
		Bank p;

		public Thread1(Bank p) {
			this.p = p;
		}

		@Override
		public void run() {
			p.withdraw(15000);
		}
	}

	class Thread2 extends Thread {
		Bank p;

		public Thread2(Bank p) {
			this.p = p;
		}

		@Override
		public void run() {
			p.Deposit(5000);
		}
	}

	public class InterThreadCommunicationEx {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Bank b = new Bank();
			Thread1 t1 = new Thread1(b);
			Thread2 t2 = new Thread2(b);
			t1.start();
			t2.start();

		}
}

