package me.tspace.pm.model;

import java.util.Date;

public class TLogin {
	private int loginID;
	private String loginName;
	private String loginPwd;
	private int loginLevel;
	private String loginIP;
	private Date loginLastDate;
	private Date loginRegDate;
	
	public int getLoginID() {
		return loginID;
	}
	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public int getLoginLevel() {
		return loginLevel;
	}
	public void setLoginLevel(int loginLevel) {
		this.loginLevel = loginLevel;
	}
	public Date getLoginRegDate() {
		return loginRegDate;
	}
	public void setLoginRegDate(Date loginRegDate) {
		this.loginRegDate = loginRegDate;
	}
	public String getLoginIP() {
		return loginIP;
	}
	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}
	public Date getLoginLastDate() {
		return loginLastDate;
	}
	public void setLoginLastDate(Date loginLastDate) {
		this.loginLastDate = loginLastDate;
	}
	
}
