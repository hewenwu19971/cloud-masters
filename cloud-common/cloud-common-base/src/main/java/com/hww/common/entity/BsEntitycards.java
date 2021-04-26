package com.hww.common.entity;


public class BsEntitycards {

  private long id;
  private String cardId;
  private long levelPoints;
  private long points;
  private double balance;
  private double percentage;
  private long merchantId;
  private long status;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public long getLevelPoints() {
    return levelPoints;
  }

  public void setLevelPoints(long levelPoints) {
    this.levelPoints = levelPoints;
  }


  public long getPoints() {
    return points;
  }

  public void setPoints(long points) {
    this.points = points;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
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
