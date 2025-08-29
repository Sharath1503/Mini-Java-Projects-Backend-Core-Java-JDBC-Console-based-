package com.bankinterface.example;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 obj = new BankChild();
		BankEntity obj1 = new BankEntity();
		System.out.println("Intial Balance : " + obj1.intialbalance);
		obj.deposit(1000);
		obj.withdraw(500);

	}

}
