package com.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.JdbcPreparedStatement;

public class DBManagerTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int num=insertDiet();
		if(num==1) {
			System.out.print("Inerted one record");
		}

	}

	public static int insertDiet () throws ClassNotFoundException, SQLException  {
		int result= -1;
		DBManager dbm=new DBManager();
		Connection conn=dbm.getMyConnection();
		
		String kksql="INSERT INTO `park_management`.`diet` (`diet_type`, `number_of_feed_per_day`) VALUES (?, ?)";
		
		PreparedStatement stm=conn.prepareStatement(kksql);
		
		stm.setString(1,"Jennie");
		stm.setInt(2, 100);
		
		result=stm.executeUpdate();
		
		return result;
		
	}

}
