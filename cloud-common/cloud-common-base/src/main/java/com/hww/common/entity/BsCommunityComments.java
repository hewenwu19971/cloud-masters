package com.hww.common.entity;


public class BsCommunityComments {

  private long id;
  private long dynamicId;
  private long memberId;
  private long status;
  private String details;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private long merchantId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDynamicId() {
    return dynamicId;
  }

  public void setDynamicId(long dynamicId) {
    this.dynamicId = dynamicId;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
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


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }

}
