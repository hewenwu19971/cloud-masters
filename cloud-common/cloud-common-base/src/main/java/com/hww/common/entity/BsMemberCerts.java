package com.hww.common.entity;


public class BsMemberCerts {

  private long id;
  private String name;
  private String frontCard;
  private String backCard;
  private long status;
  private String mark;
  private long merchantId;
  private long memberId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getFrontCard() {
    return frontCard;
  }

  public void setFrontCard(String frontCard) {
    this.frontCard = frontCard;
  }


  public String getBackCard() {
    return backCard;
  }

  public void setBackCard(String backCard) {
    this.backCard = backCard;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
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
