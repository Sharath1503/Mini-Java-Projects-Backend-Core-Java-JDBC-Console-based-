package com.threads.example;

public class MultiThreadingEx implements Runnable {
	
	@Override
	public void run()
	{
		System.out.println("thread ID:"+ Thread.currentThread().getId());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =0; i<9; i++)
		{
			MultiThreadingEx t1 = new MultiThreadingEx();
			Thread t2 = new Thread(t1);
			t2.start();

		}
	}

}
