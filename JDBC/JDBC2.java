package com.jdbc.example;

import java.sql.*;
public class JDBC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1db", "root", "12345678");
			PreparedStatement s = cn.prepareStatement("Insert into employee(ename,salary,gender) values (?,?,?)");
			s.setString(1, "Sharath");
			s.setInt(2, 20000);
			s.setString(3, "male");
			int r = s.executeUpdate();
			if (r != 0) {
				System.out.println("Inserted Successfully");
			} else
				System.out.println("Insertion failed");

			s.close();
			cn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
