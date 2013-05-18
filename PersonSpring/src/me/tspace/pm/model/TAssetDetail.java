package me.tspace.pm.model;

import java.util.Date;

public class TAssetDetail {
	private int assetID;
	private int	assetAcctID;
	private int	assetUserID;
	private String	assetState;
	private String	assetBookType;
	private String	assetBookTypeName;
	private float assetMoney;
	private Date	assetRecordTime;
	private String	assetRecordMonth;
	private String	assetRecordYear;
	private Date	AssetStartTime;
	private Date	AssetEndTime;
	private String	AssetRemark;
	
	public int getAssetID() {
		return assetID;
	}
	public void setAssetID(int assetID) {
		this.assetID = assetID;
	}
	public int getAssetAcctID() {
		return assetAcctID;
	}
	public void setAssetAcctID(int assetAcctID) {
		this.assetAcctID = assetAcctID;
	}
	public int getAssetUserID() {
		return assetUserID;
	}
	public void setAssetUserID(int assetUserID) {
		this.assetUserID = assetUserID;
	}
	public String getAssetState() {
		return assetState;
	}
	public void setAssetState(String assetState) {
		this.assetState = assetState;
	}
	public String getAssetBookType() {
		return assetBookType;
	}
	public void setAssetBookType(String assetBookType) {
		this.assetBookType = assetBookType;
	}
	public String getAssetBookTypeName() {
		return assetBookTypeName;
	}
	public void setAssetBookTypeName(String assetBookTypeName) {
		this.assetBookTypeName = assetBookTypeName;
	}
	public float getAssetMoney() {
		return assetMoney;
	}
	public void setAssetMoney(float assetMoney) {
		this.assetMoney = assetMoney;
	}
	public Date getAssetRecordTime() {
		return assetRecordTime;
	}
	public void setAssetRecordTime(Date assetRecordTime) {
		this.assetRecordTime = assetRecordTime;
	}
	public String getAssetRecordMonth() {
		return assetRecordMonth;
	}
	public void setAssetRecordMonth(String assetRecordMonth) {
		this.assetRecordMonth = assetRecordMonth;
	}
	public String getAssetRecordYear() {
		return assetRecordYear;
	}
	public void setAssetRecordYear(String assetRecordYear) {
		this.assetRecordYear = assetRecordYear;
	}
	public Date getAssetStartTime() {
		return AssetStartTime;
	}
	public void setAssetStartTime(Date assetStartTime) {
		AssetStartTime = assetStartTime;
	}
	public Date getAssetEndTime() {
		return AssetEndTime;
	}
	public void setAssetEndTime(Date assetEndTime) {
		AssetEndTime = assetEndTime;
	}
	public String getAssetRemark() {
		return AssetRemark;
	}
	public void setAssetRemark(String assetRemark) {
		AssetRemark = assetRemark;
	}
	
}
