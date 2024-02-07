package com.csm.action;

import java.util.*; 

public class Keepers {
	int keeperID;
	String name;
	Date dateOfBirth = new Date();
	String keeper_rank;
	public int getKeeperID() {
		return keeperID;
	}
	public void setKeeperID(int keeperID) {
		this.keeperID = keeperID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getKeeper_rank() {
		return keeper_rank;
	}
	public void setKeeper_rank(String keeper_rank) {
		this.keeper_rank = keeper_rank;
	}
	public Keepers(int keeperID, String name, Date dateOfBirth, String keeper_rank) {
		super();
		this.keeperID = keeperID;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.keeper_rank = keeper_rank;
	}
	public Keepers(String name, Date dateOfBirth, String keeper_rank) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.keeper_rank = keeper_rank;
	}
	
}
