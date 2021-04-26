package com.hww.common.entity;


public class BsSendBonus {

  private long id;
  private String thumb;
  private String activeName;
  private String merchantBonusId;
  private long beginTime;
  private long endTime;
  private long merchantId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }


  public String getActiveName() {
    return activeName;
  }

  public void setActiveName(String activeName) {
    this.activeName = activeName;
  }


  public String getMerchantBonusId() {
    return merchantBonusId;
  }

  public void setMerchantBonusId(String merchantBonusId) {
    this.merchantBonusId = merchantBonusId;
  }


  public long getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(long beginTime) {
    this.beginTime = beginTime;
  }


  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
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
