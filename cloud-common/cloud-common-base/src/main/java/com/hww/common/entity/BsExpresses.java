package com.hww.common.entity;


public class BsExpresses {

  private long id;
  private String expressName;
  private long merchantId;
  private double basePrice;
  private long status;
  private long sortNum;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getExpressName() {
    return expressName;
  }

  public void setExpressName(String expressName) {
    this.expressName = expressName;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public double getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getSortNum() {
    return sortNum;
  }

  public void setSortNum(long sortNum) {
    this.sortNum = sortNum;
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
