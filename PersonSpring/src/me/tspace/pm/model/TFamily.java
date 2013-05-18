package me.tspace.pm.model;

import java.util.Date;

public class TFamily {
	private int familyID;
	private String familyName;
	private Date familyRegDate;
	public int getFamilyID() {
		return familyID;
	}
	public void setFamilyID(int familyID) {
		this.familyID = familyID;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public Date getFamilyRegDate() {
		return familyRegDate;
	}
	public void setFamilyRegDate(Date familyRegDate) {
		this.familyRegDate = familyRegDate;
	}
	
	
}
