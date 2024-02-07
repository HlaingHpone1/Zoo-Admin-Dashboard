package com.csm.manager;

import com.csm.action.Diet;
import java.sql.*;
import java.util.ArrayList;

import com.csm.DBManager;

public class DietManager {
	public int insert(Diet d) throws ClassNotFoundException, SQLException {
		int result=-1;
		DBManager dbM=new DBManager();
		Connection conn=dbM.getConnection();
		
		String sql="INSERT INTO `gwwp`.`diet` (`Diet_type`, `No_of_feeds_per_days`) VALUES (?,?)";
		
		PreparedStatement ptsm=conn.prepareStatement(sql);
		
		ptsm.setString(1, d.getDietType());
		ptsm.setString(2, d.getNoOfFeed());
		
		result=ptsm.executeUpdate();
		return result;
		
	}
	
	public ArrayList<Diet>fetchAll() throws ClassNotFoundException, SQLException{
			
			ArrayList<Diet> diets = new ArrayList<Diet>();
			
			Diet c;
			
			//get connection
			DBManager dbMgr = new DBManager();
			Connection conn = dbMgr.getConnection();
			
			//query
			String sql = "SELECT * FROM gwwp.diet";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()){
				c = new Diet(rs.getInt("Diet_id"),rs.getString("Diet_type"),rs.getString("No_of_feeds_per_days"));
				diets.add(c);
			}
			return diets;
		}
	
	public void Delete(int id) throws ClassNotFoundException, SQLException {
		DBManager dbM = new DBManager();
		Connection conn = dbM.getConnection();
		
		String query = "DELETE FROM `gwwp`.`diet` WHERE `Diet_id` = ?";
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setInt(1, id);
		result.executeUpdate();
	}
	
	public int update(Diet d)throws ClassNotFoundException,
	SQLException{
		
		int r = -1;
		
		//get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//prepare statement
		String query = "UPDATE `gwwp`.`diet` SET "
				+ "`Diet_type` = ?, "
				+ "`No_of_feeds_per_days` = ? "
				+ "WHERE `Diet_id` = ?";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		
		result.setString(1, d.getDietType());
		result.setString(2, d.getNoOfFeed());
		result.setInt(3, d.getDietID());
		
		r = result.executeUpdate();
		
		return r;
	}
	
	public Diet getById (int id) throws ClassNotFoundException,
	SQLException{
		
		String query;
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//prepare statement
		query = "SELECT * FROM `gwwp`.`diet` " +
				"WHERE (`Diet_id` = ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setInt (1, id);
		ResultSet rs = pstmt.executeQuery();
		
		Diet d = null;
		
		while (rs.next()){
			d = new Diet(rs.getInt("Diet_id"),
					rs.getString("Diet_type"),
					rs.getString("No_of_feeds_per_days"));
		}
		return d;
	}
}
