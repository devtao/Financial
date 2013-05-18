package me.tspace.pm.model;

import java.util.Date;

public class TAccount {
	private int acctID;
	private int acctUserID;
	private String acctState;
	private Date acctCreateDate;
	public int getAcctID() {
		return acctID;
	}
	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}
	public int getAcctUserID() {
		return acctUserID;
	}
	public void setAcctUserID(int acctUserID) {
		this.acctUserID = acctUserID;
	}
	public String getAcctState() {
		return acctState;
	}
	public void setAcctState(String acctState) {
		this.acctState = acctState;
	}
	public Date getAcctCreateDate() {
		return acctCreateDate;
	}
	public void setAcctCreateDate(Date acctCreateDate) {
		this.acctCreateDate = acctCreateDate;
	}
	
	
	
	
	
}
