package com.csm.manager;

import java.sql.*;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.csm.DBManager;
import com.csm.action.Keepers;

public class KeepersManager {
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	public int insert(Keepers k) throws ClassNotFoundException, SQLException {
		int r =0;
		DBManager dbManager = new DBManager();
		Connection conn = dbManager.getConnection();
		
		String query = "INSERT INTO `gwwp`.`keeper` (`Name`, `Date_of_birth`, `Keeper_rank`) VALUES (?, ?, ?)";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setString(1, k.getName());
		result.setString(2, formatter.format(k.getDateOfBirth()));
		result.setString(3, k.getKeeper_rank());
		
		r = result.executeUpdate();
		
		return r;
	}
	
	public ArrayList<Keepers> fetchAll()throws ClassNotFoundException, SQLException, ParseException{
		
		ArrayList<Keepers> keeper = new ArrayList<Keepers>();
		
		Keepers k;
		
		DBManager dbManager = new DBManager();
		Connection conn = dbManager.getConnection();
		
		String query = "SELECT * FROM `gwwp`.`keeper`";
		PreparedStatement result = conn.prepareStatement(query);
		ResultSet r = result.executeQuery();
		
		while(r.next()) {
			k = new Keepers(r.getInt("Keeper_id"), r.getString("Name"), formatter.parse(r.getString("Date_of_birth")), r.getString("Keeper_rank"));
			keeper.add(k);
		}
		
		
		return keeper;
	}
	
	public void Delete(int id) throws ClassNotFoundException, SQLException {
		DBManager dbM = new DBManager();
		Connection conn = dbM.getConnection();
		
		String query = "DELETE FROM `gwwp`.`keeper` WHERE `Keeper_id` = ?";
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setInt(1, id);
		result.executeUpdate();
	}
	
	public int update(Keepers k)throws ClassNotFoundException,
	SQLException{
		
		int r = -1;
		
		//get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//prepare statement
		String query = "UPDATE `gwwp`.`keeper` SET "
				+ "`Name` = ?, "
				+ "`Date_of_birth` = ?, "
				+ "`Keeper_rank` = ? "
				+ "WHERE `Keeper_id` = ?";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		
		result.setString(1, k.getName());
		result.setString(2, formatter.format(k.getDateOfBirth()));
		result.setString(3, k.getKeeper_rank());
		result.setInt(4, k.getKeeperID());
		
		r = result.executeUpdate();
		
		return r;
	}
	
	public Keepers getById (int id) throws ClassNotFoundException,
	SQLException, ParseException{
		
		String query;
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		
		//prepare statement
		query = "SELECT * FROM `gwwp`.`keeper` " +
				"WHERE (`Keeper_id` = ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setInt (1, id);
		ResultSet r = pstmt.executeQuery();
		
		Keepers k = null;
		
		while (r.next()){
			k = new Keepers(r.getInt("Keeper_id"), r.getString("Name"),
					formatter.parse(r.getString("Date_of_birth")), r.getString("Keeper_rank"));
		}
		return k;
	}
}
