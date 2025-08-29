package com.bankinterface.example;

public interface Bank1 {
	void deposit(int amount);

	void withdraw(int amount);

	static void balanceEnquiry(int a) {
		System.out.println("Balance enquiry : " + a);
	}
}
