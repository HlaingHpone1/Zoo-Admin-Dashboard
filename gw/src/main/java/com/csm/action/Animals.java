package com.csm.action;

public class Animals{
	int animalID;
	String name;
	int gender;
	String yearOfArrival;
	int keeperID;
	int enclosureID;
	int specieID;
	int dietID;
	String keeperName;
	int noOfAnimal;
	
	
	public void setNoOfAnimal(int noOfAnimal) {
		this.noOfAnimal = noOfAnimal;
	}
	public int getAnimalID() {
		return animalID;
	}
	public void setAnimalID(int animalID) {
		this.animalID = animalID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getYearOfArrival() {
		return yearOfArrival;
	}
	public void setYearOfArrival(String yearOfArrival) {
		this.yearOfArrival = yearOfArrival;
	}
	public int getKeeperID() {
		return keeperID;
	}
	public void setKeeperID(int keeperID) {
		this.keeperID = keeperID;
	}
	public int getEnclosureID() {
		return enclosureID;
	}
	public void setEnclosureID(int enclosureID) {
		this.enclosureID = enclosureID;
	}
	public int getSpecieID() {
		return specieID;
	}
	public void setSpecieID(int specieID) {
		this.specieID = specieID;
	}
	public int getDietID() {
		return dietID;
	}
	public void setDietID(int dietID) {
		this.dietID = dietID;
	}
	
	public String getKeeperName() {
		return keeperName;
	}
	public void setKeeperName(String keeperName) {
		this.keeperName = keeperName;
	}
	
	public int getNoOfAnimal() {
		return noOfAnimal;
	}
	public Animals(int animalID, String name, int gender, String yearOfArrival, int keeperID, int enclosureID,
			int specieID, int dietID) {
		super();
		this.animalID = animalID;
		this.name = name;
		this.gender = gender;
		this.yearOfArrival = yearOfArrival;
		this.keeperID = keeperID;
		this.enclosureID = enclosureID;
		this.specieID = specieID;
		this.dietID = dietID;
	}
	public Animals(String name, int gender, String yearOfArrival, int keeperID, int enclosureID, int specieID,
			int dietID) {
		super();
		this.name = name;
		this.gender = gender;
		this.yearOfArrival = yearOfArrival;
		this.keeperID = keeperID;
		this.enclosureID = enclosureID;
		this.specieID = specieID;
		this.dietID = dietID;
	}
	public Animals(int animalID, String name, int gender, String yearOfArrival, int keeperID, String keeperName) {
		super();
		this.animalID = animalID;
		this.name = name;
		this.gender = gender;
		this.yearOfArrival = yearOfArrival;
		this.keeperID = keeperID;
		this.keeperName = keeperName;
	}
	public Animals(String keeperName, int noOfAnimal) {
		super();
		this.keeperName = keeperName;
		this.noOfAnimal = noOfAnimal;
	}
	
	
	
	
}