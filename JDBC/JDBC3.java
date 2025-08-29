package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1db", "root", "12345678");
			PreparedStatement sta = conn.prepareStatement("UPDATE employee SET salary = ?, gender = ? WHERE ename = ?");
			sta.setInt(1, 50000);
			sta.setString(2, "female");
			sta.setString(3, "c");
			int res = sta.executeUpdate();
			if (res != 0) {
				System.out.println("Updated Successfully");
			} else
				
				System.out.println("Update failed");

			sta.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
