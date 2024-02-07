package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	public Connection getMyConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/park_management";
		String myusername="root";
		String mypassword="root";
		
		conn=DriverManager.getConnection(url, myusername, mypassword);
		
		return conn;
	}
}
