package com.csm;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBManager {
	public Connection getConnection() throws 
	 ClassNotFoundException, SQLException{
		
		Connection connection = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dbName = "jdbc:mysql://localhost:3307/gwwp";
		
		String dbUser = "root";
		
		String dbPassword = "asdf";
		
		connection = DriverManager.getConnection(dbName,dbUser,dbPassword);
		
		return connection;
	}

}
