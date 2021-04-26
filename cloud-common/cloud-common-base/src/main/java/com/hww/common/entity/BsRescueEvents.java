package com.hww.common.entity;


public class BsRescueEvents {

  private long id;
  private long memberId;
  private long merchantId;
  private String name;
  private String mobile;
  private String address;
  private double longs;
  private double lat;
  private String models;
  private String mark;
  private long conductor;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public double getLongs() {
    return longs;
  }

  public void setLong(double longs) {
    this.longs = longs;
  }


  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }


  public String getModels() {
    return models;
  }

  public void setModels(String models) {
    this.models = models;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public long getConductor() {
    return conductor;
  }

  public void setConductor(long conductor) {
    this.conductor = conductor;
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
