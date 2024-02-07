package com.csm.dao;

import com.csm.entity.Diet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.*;

public class DietManager {

	public int insert(Diet d) throws ClassNotFoundException, SQLException {
		int result=-1;
		DBManager dbM=new DBManager();
		Connection conn=dbM.getMyConnection();
		
		String sql="INSERT INTO `park_management`.`diet` (`diet_type`, `number_of_feed_per_day`) VALUES (?,?)";
		
		PreparedStatement ptsm=conn.prepareStatement(sql);
		
		ptsm.setString(1, d.getDietType());
		ptsm.setString(2, d.getNoOfFeed());
		
		result=ptsm.executeUpdate();
		return result;
		
	}
}
