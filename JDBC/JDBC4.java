package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conne = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1db", "root", "12345678");
			PreparedStatement stat = conne.prepareStatement("DELETE from employee WHERE ename = ?");
			stat.setString(1, "a");
			int res1 = stat.executeUpdate();
			if (res1 != 0) {
				System.out.println("Deleted Successfully");
			} else
				System.out.println("Deletion failed");

			stat.close();
			conne.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
