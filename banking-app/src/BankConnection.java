package com.bankappjdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankConnection {
	
	 static String url = "jdbc:mysql://localhost:3306/bankdb";
	    static String username = "root";
	    static String password = "12345678";
	    static Connection con = null;
	    public static Connection getConn() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(url, username, password);
	            return con;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	    public static void closeConn() throws SQLException
	    {
	    	if(con != null) {
	    		con.close();
	    	}
	    }

}
