package com.jdbc.example;

import java.sql.*;

public class JDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeedb";
			String Admin = "root";
			String Password = "12345678";
			Connection con = DriverManager.getConnection(url, Admin, Password);
			Statement st = con.createStatement();
			String sql = "Select * from employee";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println("Employee ID:" + rs.getInt(2) + "\nEmployee Name:" + rs.getString(1)
						+ "\nEmployee Gender:" + rs.getString(3));
			}
			rs.close();
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
