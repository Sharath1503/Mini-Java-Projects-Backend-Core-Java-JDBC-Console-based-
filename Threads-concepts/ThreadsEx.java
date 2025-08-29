package com.threads.example;

public class ThreadsEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread();
		System.out.println(Thread.activeCount());
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getState());
		t1.start();
		System.out.println(Thread.activeCount());
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getState());
		

	}

}
