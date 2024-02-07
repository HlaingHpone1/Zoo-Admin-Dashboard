package com.csm.action;

public class Species {
	int specieID;
	String specieType;
	String lifeStyle;
	String conservationStatus;
	String specieGroup;
	public int getSpecieID() {
		return specieID;
	}
	public void setSpecieID(int specieID) {
		this.specieID = specieID;
	}
	public String getSpecieType() {
		return specieType;
	}
	public void setSpecieType(String specieType) {
		this.specieType = specieType;
	}
	public String getLifeStyle() {
		return lifeStyle;
	}
	public void setLifeStyle(String lifeStyle) {
		this.lifeStyle = lifeStyle;
	}
	public String getConservationStatus() {
		return conservationStatus;
	}
	public void setConservationStatus(String conservationStatus) {
		this.conservationStatus = conservationStatus;
	}
	public String getSpecieGroup() {
		return specieGroup;
	}
	public Species(int specieID, String specieType, String lifeStyle, String conservationStatus, String specieGroup) {
		super();
		this.specieID = specieID;
		this.specieType = specieType;
		this.lifeStyle = lifeStyle;
		this.conservationStatus = conservationStatus;
		this.specieGroup = specieGroup;
	}
	public void setSpecieGroup(String specieGroup) {
		this.specieGroup = specieGroup;
	}
	public Species(String specieType, String lifeStyle, String conservationStatus, String specieGroup) {
		super();
		this.specieType = specieType;
		this.lifeStyle = lifeStyle;
		this.conservationStatus = conservationStatus;
		this.specieGroup = specieGroup;
	}
	
	
	
}
