package com.csm.manager;

import java.sql.*
;
import java.text.ParseException;
import java.util.ArrayList;

import com.csm.DBManager;
import com.csm.action.Species;

public class SpeciesManager {
	public int insert(Species s) throws ClassNotFoundException, SQLException {
		int r=0;
		
		DBManager dbManager = new DBManager();
		Connection conn = dbManager.getConnection();
		
		String query = "INSERT INTO `gwwp`.`specie` (`Specie_type`, `Life_style`, `Conservation_status`, `Specie_group`) VALUES (?, ?, ?, ?)";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setString(1, s.getSpecieType());
		result.setString(2, s.getLifeStyle());
		result.setString(3, s.getConservationStatus());
		result.setString(4, s.getSpecieGroup());
		
		r = result.executeUpdate();
		
		return r;
	}
	
	public ArrayList<Species>fetchAll() throws ClassNotFoundException, SQLException{
		
		ArrayList<Species> species = new ArrayList<Species>();
		
		Species s;
		
		//get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//query
		String sql = "SELECT * FROM gwwp.specie";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()){
			s = new Species(rs.getInt("Specie_id"),rs.getString("Specie_type"),rs.getString("Life_style"),rs.getString("Conservation_status"),
					rs.getString("Specie_group"));
			species.add(s);
		}
		return species;
	}
	
	public void Delete(int id) throws ClassNotFoundException, SQLException {
		DBManager dbM = new DBManager();
		Connection conn = dbM.getConnection();
		
		String query = "DELETE FROM `gwwp`.`specie` WHERE `Specie_id` = ?";
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setInt(1, id);
		result.executeUpdate();
	}
	
	public int update(Species s)throws ClassNotFoundException,
	SQLException{
		
		int r = -1;
		
		//get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//prepare statement
		String query = "UPDATE `gwwp`.`specie` SET "
				+ "`Specie_type` = ?, "
				+ "`Life_style` = ?, "
				+ "`Conservation_status` = ?, "
				+ "`Specie_group` = ? "
				+ "WHERE `Specie_id` = ?";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		
		result.setString(1, s.getSpecieType());
		result.setString(2, s.getLifeStyle());
		result.setString(3, s.getConservationStatus());
		result.setString(4, s.getSpecieGroup());
		result.setInt(5, s.getSpecieID());
		
		r = result.executeUpdate();
		
		return r;
	}
	
	public Species getById (int id) throws ClassNotFoundException,
	SQLException, ParseException{
		
		String query;
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		
		//prepare statement
		query = "SELECT * FROM `gwwp`.`specie` " +
				"WHERE (`Specie_id` = ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setInt (1, id);
		ResultSet r = pstmt.executeQuery();
		
		Species k = null;
		
		while (r.next()){
			k = new Species(r.getInt("Specie_id"),
					r.getString("Specie_type"),
					r.getString("Life_style"),
					r.getString("Conservation_status"),
					r.getString("Specie_group")
					);
		}
		return k;
	}
}
