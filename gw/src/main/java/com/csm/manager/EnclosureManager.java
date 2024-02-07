package com.csm.manager;

import java.sql.*;
import java.util.ArrayList;

import com.csm.DBManager;
import com.csm.action.Diet;
import com.csm.action.Enclosure;

public class EnclosureManager {
	public int insert(Enclosure e) throws ClassNotFoundException, SQLException {
		int r = 0;
		
		DBManager dbManager = new DBManager();
		Connection conn = dbManager.getConnection();
		
		String query = "INSERT INTO `gwwp`.`enclosure` (`Enclosure_type`, `Location`) VALUES (?, ?)";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setString(1, e.getEnclosureType());
		result.setString(2, e.getLocation());
		
		r = result.executeUpdate();
		
		
		return r;
	}
	
	public ArrayList<Enclosure>fetchAll() throws ClassNotFoundException, SQLException{
		
		ArrayList<Enclosure> enclosures = new ArrayList<Enclosure>();
		
		Enclosure e;
		
		//get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//query
		String sql = "SELECT * FROM `gwwp`.`enclosure`";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()){
			e = new Enclosure(rs.getInt("Enclosure_id"),rs.getString("Enclosure_type"),rs.getString("Location"));
			enclosures.add(e);
		}
		return enclosures;
	}
	
	public void Delete(int id) throws ClassNotFoundException, SQLException {
		DBManager dbM = new DBManager();
		Connection conn = dbM.getConnection();
		
		String query = "DELETE FROM `gwwp`.`enclosure` WHERE `Enclosure_id` = ?";
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setInt(1, id);
		result.executeUpdate();
	}
	
	public int update(Enclosure e)throws ClassNotFoundException,
	SQLException{
		
		int r = -1;
		
		//get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//prepare statement
		String query = "UPDATE `gwwp`.`enclosure` SET "
				+ "`Enclosure_type` = ?, "
				+ "`Location` = ? "
				+ "WHERE `Enclosure_id` = ?";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		
		result.setString(1, e.getEnclosureType());
		result.setString(2, e.getLocation());
		result.setInt(3, e.getEnclosureID());
		
		r = result.executeUpdate();
		
		return r;
	}
	
	public Enclosure getById (int id) throws ClassNotFoundException,
	SQLException{
		
		String query;
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//prepare statement
		query = "SELECT * FROM `gwwp`.`enclosure` " +
				"WHERE (`Enclosure_id` = ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setInt (1, id);
		ResultSet rs = pstmt.executeQuery();
		
		Enclosure e = null;
		
		while (rs.next()){
			e = new Enclosure(rs.getInt("Enclosure_id"),
					rs.getString("Enclosure_type"),
					rs.getString("Location"));
		}
		return e	;
	}
}
