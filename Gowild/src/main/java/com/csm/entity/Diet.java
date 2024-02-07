package com.csm.entity;

public class Diet {
	int dietID;
String dietType;
String noOfFeed;
public int getDietID() {
	return dietID;
}
public void setDietID(int dietID) {
	this.dietID = dietID;
}
public String getDietType() {
	return dietType;
}
public void setDietType(String dietType) {
	this.dietType = dietType;
}
public String getNoOfFeed() {
	return noOfFeed;
}
public void setNoOfFeed(String noOfFeed) {
	this.noOfFeed = noOfFeed;
}
public Diet(int dietID, String dietType, String noOfFeed) {
	super();
	this.dietID = dietID;
	this.dietType = dietType;
	this.noOfFeed = noOfFeed;
}
public Diet(String dietType, String noOfFeed) {
	super();
	this.dietType = dietType;
	this.noOfFeed = noOfFeed;
}


}
