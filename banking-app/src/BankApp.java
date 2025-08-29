package com.bank.ex;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Cleaner.Cleanable;

class Customer {
	String CustName;
	int AccNo;
	String Address;
	String Gender;
	int Age;
	long MobileNumber;
	int Balance;
	String Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}

}

public class BankApp {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void Deposite(Customer customers[]) throws NumberFormatException, IOException {
		int AccNo;
		int Amount;
		System.out.println("Enter Account Number : ");
		AccNo = Integer.parseInt(br.readLine());
		System.out.println("Enter Amount : ");
		Amount = Integer.parseInt(br.readLine());

		for (Customer customer : customers) {
			if (customer.AccNo == AccNo) {
				customer.Balance = customer.Balance + Amount;
				System.out.println("Updated Balance: " + customer.Balance);

			}
		}
	}

	void WithDraw(Customer customers[]) throws IOException, UsernamePasswordIncorrectException {
		System.out.println("Enter Customer Name : ");
		String CustName = br.readLine();
		System.out.println("Enter Password : ");
		String pass = br.readLine();
		int temp = 0;
		for (Customer customer : customers) {
			if (customer.getCustName().equals(CustName) && customer.Password.equals(pass)) {
				temp = 1;
				System.out.println("Enter amount to withdraw : ");
				int amount = Integer.parseInt(br.readLine());
				customer.Balance = customer.Balance - amount;
				System.out.println("Updated Amount : " + customer.getBalance());
			}

		}

		if (temp == 0) {
			System.out.println("Username and Password Incorrect");

		}
	}

	void BalEnq(Customer customers[]) throws NumberFormatException, IOException {
		int AccNo;
		System.out.println("Enter Account Number to Check Balance : ");
		AccNo = Integer.parseInt(br.readLine());
		for (Customer customer : customers) {
			if (customer.AccNo == AccNo) {
				System.out.println("Balance : " + customer.getBalance());
			}
		}
	}

	void viewTransactions(Customer customers[]) throws NumberFormatException, IOException {
		int AccNo;
		System.out.println("Enter Account Number to view Transactions : ");
		AccNo = Integer.parseInt(br.readLine());
		for (Customer customer : customers) {
			if (customer.AccNo == AccNo) {
				System.out.println("Customer Name: " + customer.CustName);
				System.out.println("Transactions: " + customer.Balance);
			}
		}
	}

	public static void main(String[] args)
			throws NumberFormatException, IOException, UsernamePasswordIncorrectException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of Customers :");
		int n = Integer.parseInt(br.readLine());
		Customer customers[] = new Customer[n];
		for (int i = 0; i < n; i++) {
			Customer customer = new Customer();
			System.out.println("Enter Customer Name : ");
			customer.setCustName(br.readLine());
			System.out.println("Enter Customer Password : ");
			customer.setPassword(br.readLine());
			System.out.println("Enter Customer Account Number : ");
			customer.setAccNo(Integer.parseInt(br.readLine()));
			System.out.println("Enter Deposite Amount : ");
			customer.setBalance(Integer.parseInt(br.readLine()));
			System.out.println("Enter Customer Mobile Number : ");
			customer.setMobileNumber(Long.parseLong(br.readLine()));
			System.out.println("Enter Gender : ");
			customer.setGender(br.readLine());
			System.out.println("Enter Customer Age : ");
			customer.setAge(Integer.parseInt(br.readLine()));
			System.out.println("Enter Customer Address : ");
			customer.setAddress(br.readLine());
			customers[i] = customer;
			System.out.println("\n\n");

		}
//		for (Customer customer:customers)
//		{
//			System.out.println("Customer Name: "+customer.CustName);
//			System.out.println("Customer Account Number: "+customer.AccNo);
//			System.out.println("Customer Age: "+customer.Age);
//			System.out.println("Customer Gender: "+customer.Gender);
//			System.out.println("Customer Mobile Number: "+customer.MobileNumber);
//			System.out.println("Customer Address: "+customer.Address);
//		}
		int choice;
		BankApp obj = new BankApp();
		do {

			System.out.println("1. Deposite");
			System.out.println("2. WithDraw");
			System.out.println("3. BalEnq");
			System.out.println("4. Mini Statement");
			System.out.println("0. Exit");

			System.out.println("Enter Choice :");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				obj.Deposite(customers);
				break;
			case 2:
				obj.WithDraw(customers);
				break;
			case 3:
				obj.BalEnq(customers);
				break;
			case 4:
				obj.viewTransactions(customers);
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Please Enter Number Between 0 to 3");
			}
		} while (choice != 0);
	}

}
