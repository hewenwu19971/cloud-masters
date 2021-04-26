package com.hww.common.entity;


public class BsSignLogs {

  private long id;
  private long mId;
  private String award;
  private long serialDays;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }


  public String getAward() {
    return award;
  }

  public void setAward(String award) {
    this.award = award;
  }


  public long getSerialDays() {
    return serialDays;
  }

  public void setSerialDays(long serialDays) {
    this.serialDays = serialDays;
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
