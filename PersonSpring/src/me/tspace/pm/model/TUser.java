package me.tspace.pm.model;

import java.util.Date;

public class TUser {
	private int userID;
	private int userLoginID;
	private int userFamilyID;
	private int userLevel;
	private String userName;
	private String userEmail;
	private String userPhone;
	private Date userBirthday;
	private Date userRegDate;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getUserLoginID() {
		return userLoginID;
	}
	public void setUserLoginID(int userLoginID) {
		this.userLoginID = userLoginID;
	}
	public int getUserFamilyID() {
		return userFamilyID;
	}
	public void setUserFamilyID(int userFamilyID) {
		this.userFamilyID = userFamilyID;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	public Date getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(Date userRegDate) {
		this.userRegDate = userRegDate;
	}
	
	
	
	
}
