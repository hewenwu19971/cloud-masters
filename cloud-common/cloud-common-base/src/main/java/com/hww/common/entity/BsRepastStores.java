package com.hww.common.entity;


public class BsRepastStores {

  private long id;
  private String storeName;
  private String address;
  private double longitude;
  private double latitude;
  private long merchantId;
  private String mobile;
  private String openId;
  private String startTime;
  private String endTime;
  private long status;
  private String cover;
  private String describe;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }


  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }


  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

}
