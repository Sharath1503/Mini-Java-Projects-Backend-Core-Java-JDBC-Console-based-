package com.threads.example;

class Class1 extends Thread implements Runnable{
	  @Override
	    public void run() {
	        System.out.println("Thread ID: " + Thread.currentThread().getId());
	    }

}
public class ThreadsEx1 {

  
    public static void main(String[] args) {
        int i = 0;
        while (i < 9) {
        	Class1 t1 = new Class1();
			Thread t2 = new Thread(t1);
			t2.start();
            i++;
        }
    }
}

