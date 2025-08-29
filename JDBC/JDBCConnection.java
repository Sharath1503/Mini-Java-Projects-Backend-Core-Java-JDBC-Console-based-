package com.jdbc1.example;

import java.sql.*;

public class JDBCConnection {
	
	static String url = "jdbc:mysql://localhost:3306/student1db";
	static String username = "root";
	static String password = "12345678";

	   public static Connection getConn() {
	      try {
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con = DriverManager.getConnection(url, username, password);
	         return con;
	      } catch (Exception var1) {
	         var1.printStackTrace();
	         return null;
	      }
	   }
	}
