package me.tspace.pm.model;

import java.util.Date;

public class TAccountBookType {
	private int bookID;
	private int bookType;
	private String bookName;
	private float bookRate;
	private Date bookStartTime;
	private Date bookEndTime;
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getBookType() {
		return bookType;
	}
	public void setBookType(int bookType) {
		this.bookType = bookType;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getBookRate() {
		return bookRate;
	}
	public void setBookRate(float bookRate) {
		this.bookRate = bookRate;
	}
	public Date getBookStartTime() {
		return bookStartTime;
	}
	public void setBookStartTime(Date bookStartTime) {
		this.bookStartTime = bookStartTime;
	}
	public Date getBookEndTime() {
		return bookEndTime;
	}
	public void setBookEndTime(Date bookEndTime) {
		this.bookEndTime = bookEndTime;
	}
}
