package com.csm.manager;

import java.sql.*;
import java.util.ArrayList;

import com.csm.DBManager;
import com.csm.action.Animals;

public class AnimalsManager {
	public int insert(Animals a) throws ClassNotFoundException, SQLException {
		
		int r = -1;
		DBManager dbManager = new DBManager();
		Connection conn = dbManager.getConnection();
		
		String query = "INSERT INTO `gwwp`.`animal` (`Name`, `Gender`, `Year_of_arrival`, `Keeper_id`, `Enclosure_id`,"
				+ " `Specie_id`, `Diet_id` ) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setString(1, a.getName());
		result.setInt(2, a.getGender());
		result.setString(3, a.getYearOfArrival());
		result.setInt(4, a.getKeeperID());
		result.setInt(5, a.getEnclosureID());
		result.setInt(6, a.getSpecieID());
		result.setInt(7, a.getDietID());
		
		r = result.executeUpdate();
		
		return r;
	}
	
	public ArrayList<Animals> fetchAll() throws ClassNotFoundException, SQLException {
		ArrayList<Animals> animal = new ArrayList<Animals>();
		
		DBManager dbManager = new DBManager();
		Connection conn = dbManager.getConnection();
		
		Animals a;
		String query = "SELECT * FROM `gwwp`.`animal`";
		PreparedStatement result = conn.prepareStatement(query);
		ResultSet r=result.executeQuery();
		
		while(r.next()) {
			a = new Animals(r.getInt("Animal_id"),r.getString("Name"),r.getInt("Gender"),
					r.getString("Year_of_arrival"), r.getInt("Keeper_id"), r.getInt("Enclosure_id"),
					r.getInt("Specie_id") , r.getInt("Diet_id"));
			animal.add(a);
		}
		
		return animal;
	}
	
	public ArrayList<Animals> animalKeeper() throws ClassNotFoundException, SQLException {
		ArrayList<Animals> animal = new ArrayList<Animals>();
		
		DBManager dbManager = new DBManager();
		Connection conn = dbManager.getConnection();
		
		Animals a;
		String query = "select animal.Animal_id, animal.Name, animal.Gender, "
				+ "animal.Year_of_arrival, keeper.Keeper_id, keeper.Name "
				+ "from animal "
				+ "inner join keeper on animal.Keeper_id = keeper.Keeper_id "
				+ "where keeper.Name in (\"Dave\",\"Temi\");";
		
		PreparedStatement result = conn.prepareStatement(query);
		ResultSet r=result.executeQuery();
		
		while(r.next()) {
			a = new Animals(r.getInt("Animal_id"),r.getString("Name"),r.getInt("Gender"),
					r.getString("Year_of_arrival"), r.getInt("Keeper_id"), r.getString("Name"));
			
			animal.add(a);
		}
		
		return animal;
	}
	
	public ArrayList<Animals> keeper() throws ClassNotFoundException, SQLException {
		ArrayList<Animals> animal = new ArrayList<Animals>();
		
		DBManager dbManager = new DBManager();
		Connection conn = dbManager.getConnection();
		
		Animals a;
		String query = "select keeper.Name as Keeper_Name, count(animal.Animal_id) as No_of_animals "
				+ "from keeper "
				+ "left join animal on keeper.Keeper_id = animal.Keeper_id "
				+ "group by keeper.Name ";
		PreparedStatement result = conn.prepareStatement(query);
		ResultSet r=result.executeQuery();
		
		while(r.next()) {
			a = new Animals(r.getString("Keeper_Name"),r.getInt("No_of_animals"));
			animal.add(a);
			
		}
		
		return animal;
	}
	
	public void Delete(int id) throws ClassNotFoundException, SQLException {
		DBManager dbM = new DBManager();
		Connection conn = dbM.getConnection();
		
		String query = "DELETE FROM `gwwp`.`animal` WHERE `Animal_id` = ?";
		PreparedStatement result = conn.prepareStatement(query);
		
		result.setInt(1, id);
		result.executeUpdate();
		
	}
	
	public int update(Animals a)throws ClassNotFoundException,
	SQLException{
		
		int r = -1;
		
		//get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//prepare statement
		String query = "UPDATE `gwwp`.`animal` SET "
				+ "`Name` = ?,  "
				+ "`Gender` = ?, "
				+ "`Year_of_arrival` = ?, "
				+ "`Keeper_id` = ?, "
				+ "`Enclosure_id` = ?, "
				+ "`Diet_id` = ?, "
				+ "`Specie_id` = ? "
				+ "WHERE `Animal_id` = ?";
		
		PreparedStatement result = conn.prepareStatement(query);
		
		
		result.setString(1, a.getName());
		result.setInt(2, a.getGender());
		result.setString(3, a.getYearOfArrival());
		result.setInt(4, a.getKeeperID());
		result.setInt(5, a.getEnclosureID());
		result.setInt(6, a.getDietID());
		result.setInt(7, a.getSpecieID());
		result.setInt(8, a.getAnimalID());
		
		
		r = result.executeUpdate();
		
		return r;
	}
	
	public Animals getById (int id) throws ClassNotFoundException,
	SQLException{
		
		String query;
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//prepare statement
		query = "SELECT * FROM `gwwp`.`animal` " +
				"WHERE (`Animal_id` = ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setInt (1, id);
		ResultSet rs = pstmt.executeQuery();
		
		Animals animals = null;
		
		while (rs.next()){
			animals = new Animals(rs.getInt("Animal_id"),
					rs.getString("Name"),
					rs.getInt("Gender"),
					rs.getString("Year_of_arrival"),
					rs.getInt("Specie_id"),
					rs.getInt("Keeper_id"),
					rs.getInt("Diet_id"),
					rs.getInt("Enclosure_id"));
		}
		return animals;
	}
	
}
