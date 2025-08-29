package com.bankinterface.example;

public class BankChild implements Bank1 {
	BankEntity obj = new BankEntity();

	public void deposit(int amount) {
		// TODO Auto-generated method stub
		int total = obj.getIntialbalance() + amount;
		System.out.println("After Deposit of 1000 : " + total);
		obj.setIntialbalance(total);
	}

	public void withdraw(int amount) {
		// TODO Auto-generated method stub

		int total = obj.getIntialbalance() - amount;
		System.out.println("After Withdraw of 500 : " + total);
		obj.setIntialbalance(total);
		Bank1.balanceEnquiry(total);

	}
}
