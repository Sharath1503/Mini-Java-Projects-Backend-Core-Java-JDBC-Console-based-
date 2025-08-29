package com.bankappjdbc.ex;

import java.io.*;
import java.sql.*;

public class BankApp {
	BufferedReader br;

	public BankApp() {
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	public void registerCustomer() throws NumberFormatException, IOException {

		System.out.println("Enter Customer ID: ");
		int cid = Integer.parseInt(this.br.readLine());
		System.out.println("Enter Customer Full Name: ");
		String cname = this.br.readLine();
		System.out.println("Enter Customer Mobile: ");
		long cmob = Long.parseLong(this.br.readLine());
		System.out.println("Enter Customer age: ");
		int cage = Integer.parseInt(this.br.readLine());
		System.out.println("Deposit Amount: ");
		double damt = Double.parseDouble(this.br.readLine());
		System.out.println("Enter Email: ");
		String email = this.br.readLine();
		System.out.println("Create Password: ");
		String pswd = this.br.readLine();
		Connection con = BankConnection.getConn();

		try {
			PreparedStatement st = con.prepareStatement(
					"insert into customer(customerID, Name, Mobileno, age, depositedamount, Email, password) values(?,?,?,?,?,?,?)");
			st.setInt(1, cid);
			st.setString(2, cname);
			st.setLong(3, cmob);
			st.setInt(4, cage);
			st.setDouble(5, damt);
			st.setString(6, email);
			st.setString(7, pswd);
			int rs = st.executeUpdate();
			if (rs == 1) {
				System.out.println("Registered Successfully...");
			} else {
				System.out.println("Failed to Register");
			}
			BankConnection.closeConn();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Login() throws NumberFormatException, IOException {

		System.out.println("Enter Email to Login: ");
		String email = this.br.readLine();
		System.out.println("Enter your Password: ");
		String pswd = this.br.readLine();
		Connection con = BankConnection.getConn();
		try {
			Statement st = con.createStatement();
			String sql = "select * from customer";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString(6).equals(email) && rs.getString(7).equals(pswd)) {
					System.out.println("login success");
					CustomerEntity customer = new CustomerEntity();
					customer.setCid(rs.getInt("customerID"));

					loginSuccess(customer);
				}
			}
			BankConnection.closeConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loginSuccess(CustomerEntity customer) throws NumberFormatException, IOException, SQLException {
		BankApp obj = new BankApp();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("1. Edit Profile");
			System.out.println("2. Transactions");
			System.out.println("0. Logout");
			System.out.println("Enter Choice: ");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				obj.editProfile(customer);
				break;
			case 2:
				obj.Transactions(customer);
				break;
			case 0:
				System.out.println("Logging out...");
				break;
			default:
				System.out.println("Enter Correct Choice....");
			}
		} while (choice != 0);
	}

	private void Transactions(CustomerEntity customer) throws NumberFormatException, IOException, SQLException {
		// TODO Auto-generated method stub
		BankApp obj = new BankApp();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance Enquiry");
			System.out.println("0. Go Back");
			System.out.println("Enter Choice: ");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				obj.Deposit(customer);
				break;
			case 2:
				obj.Withdraw(customer);
				break;
			case 3:
				obj.balanceEnquiry(customer);
				break;
			case 0:
				System.out.println("Going Back...");
				break;
			default:
				System.out.println("Enter Correct Choice....");
			}
		} while (choice != 0);

	}

	private void balanceEnquiry(CustomerEntity customer) throws SQLException {
		Connection con = BankConnection.getConn();

		try {
			PreparedStatement st = con.prepareStatement("SELECT depositedamount FROM customer where customerID =?");
			st.setInt(1, customer.getCid());
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println("Total Balance: " + rs.getDouble("depositedamount"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			BankConnection.closeConn();
		}

	}

	private void Withdraw(CustomerEntity customer) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		double balance = 0;
		System.out.println("Enter Amount to Withdraw: ");
		double amt = Double.parseDouble(this.br.readLine());
		Connection con = BankConnection.getConn();
		try {
			PreparedStatement st = con.prepareStatement("SELECT depositedamount FROM customer where customerID =?");
			st.setInt(1, customer.getCid());
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				balance = rs.getInt(1) - amt;
				PreparedStatement pst = con
						.prepareStatement("UPDATE customer SET depositedamount=? WHERE customerID=? ");
				pst.setDouble(1, balance);
				pst.setInt(2, customer.getCid());

				int status = pst.executeUpdate();
				if (status == 1) {
					System.out.println("Withdraw Successful... ");
				}
			}
			BankConnection.closeConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void Deposit(CustomerEntity customer) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		double balance = 0;
		System.out.println("Enter Amount to Deposit: ");
		double amt = Double.parseDouble(this.br.readLine());
		Connection con = BankConnection.getConn();
		try {
			PreparedStatement st = con.prepareStatement("SELECT depositedamount FROM customer where customerID =?");
			st.setInt(1, customer.getCid());
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				balance = amt + rs.getInt(1);

				PreparedStatement pst = con
						.prepareStatement("UPDATE customer SET depositedamount=? WHERE customerID=? ");
				pst.setDouble(1, balance);
				pst.setInt(2, customer.getCid());

				int status = pst.executeUpdate();
				if (status == 1) {
					System.out.println("Deposited Successfully... ");
				}
			}
			BankConnection.closeConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void editProfile(CustomerEntity customer) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BankApp obj = new BankApp();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("1. Update Name");
			System.out.println("2. Update Mobile Number");
			System.out.println("3. Update Age");
			System.out.println("0. Logout");
			System.out.println("Enter Choice: ");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				obj.updateName(customer);
				break;
			case 2:
				obj.updateMobile(customer);
				break;
			case 3:
				obj.updateAge(customer);
				break;
			case 0:
				System.out.println("Logging out...");
				break;
			default:
				System.out.println("Enter Correct Choice....");
			}
		} while (choice != 0);

	}

	private void updateAge(CustomerEntity customer) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Age: ");
		int cage = Integer.parseInt(this.br.readLine());
		Connection con = BankConnection.getConn();
		try {
			PreparedStatement st = con.prepareStatement("update customer set age=? where customerID=?");
			st.setLong(1, cage);
			st.setInt(2, customer.getCid());
			int result = st.executeUpdate();
			if (result == 1) {
				System.out.println("Age Updated Successfully");
			} else {
				System.out.println("Failed to Update ");
			}
			BankConnection.closeConn();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void updateMobile(CustomerEntity customer) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter new Mobile Number: ");
		long cmob = Long.parseLong(this.br.readLine());
		Connection con = BankConnection.getConn();
		try {
			PreparedStatement st = con.prepareStatement("update customer set Mobileno=? where customerID=?");
			st.setLong(1, cmob);
			st.setInt(2, customer.getCid());
			int result = st.executeUpdate();
			if (result == 1) {
				System.out.println("Mobile Number Updated Successfully");
			} else {
				System.out.println("Failed to Update ");
			}
			BankConnection.closeConn();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void updateName(CustomerEntity customer) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter new Name: ");
		String cname = this.br.readLine();
		Connection con = BankConnection.getConn();
		try {
			PreparedStatement st = con.prepareStatement("update customer set Name=? where customerID=?");
			st.setString(1, cname);
			st.setInt(2, customer.getCid());
			int result = st.executeUpdate();
			if (result == 1) {
				System.out.println("Name Updated Successfully");
			} else {
				System.out.println("Failed to Update Name");
			}
			BankConnection.closeConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BankApp obj = new BankApp();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("Welcome to ABC Bank");
			System.out.println("1. Register as a new customer");
			System.out.println("2. Existing customer? Login.");
			System.out.println("0. Exit");
			System.out.println("Enter Choice: ");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				obj.registerCustomer();
				break;
			case 2:
				obj.Login();
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Enter Correct Choice....");
			}
		} while (choice != 0);
	}

}
