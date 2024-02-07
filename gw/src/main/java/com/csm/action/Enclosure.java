package com.csm.action;

public class Enclosure {
	int enclosureID;
	String enclosureType;
	String location;
	
	public int getEnclosureID() {
		return enclosureID;
	}
	public void setEnclosureID(int enclosureID) {
		this.enclosureID = enclosureID;
	}
	public String getEnclosureType() {
		return enclosureType;
	}
	public void setEnclosureType(String enclosureType) {
		this.enclosureType = enclosureType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Enclosure(int enclosureID, String enclosureType, String location) {
		super();
		this.enclosureID = enclosureID;
		this.enclosureType = enclosureType;
		this.location = location;
	}
	public Enclosure(String enclosureType, String location) {
		super();
		this.enclosureType = enclosureType;
		this.location = location;
	}
	
}
