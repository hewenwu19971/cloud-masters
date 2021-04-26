package com.hww.common.entity;


public class BsCommunityBanned {

  private long id;
  private long memberId;
  private long bannedType;
  private java.sql.Timestamp time;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private String reason;
  private long merchantId;


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


  public long getBannedType() {
    return bannedType;
  }

  public void setBannedType(long bannedType) {
    this.bannedType = bannedType;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
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


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }

}
