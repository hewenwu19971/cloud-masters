package com.hww.common.entity;


public class BsMembers {

  private long id;
  private String name;
  private String headerImg;
  private String openid;
  private String mobile;
  private long status;
  private String allSuperiors;
  private long superiorId;
  private long points;
  private double balance;
  private double percentage;
  private long levelPoints;
  private long merchantId;
  private String payPwd;
  private String vipCard;
  private String clientType;
  private double grandTotal;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private double creditMoney;


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


  public String getHeaderImg() {
    return headerImg;
  }

  public void setHeaderImg(String headerImg) {
    this.headerImg = headerImg;
  }


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getAllSuperiors() {
    return allSuperiors;
  }

  public void setAllSuperiors(String allSuperiors) {
    this.allSuperiors = allSuperiors;
  }


  public long getSuperiorId() {
    return superiorId;
  }

  public void setSuperiorId(long superiorId) {
    this.superiorId = superiorId;
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


  public long getLevelPoints() {
    return levelPoints;
  }

  public void setLevelPoints(long levelPoints) {
    this.levelPoints = levelPoints;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public String getPayPwd() {
    return payPwd;
  }

  public void setPayPwd(String payPwd) {
    this.payPwd = payPwd;
  }


  public String getVipCard() {
    return vipCard;
  }

  public void setVipCard(String vipCard) {
    this.vipCard = vipCard;
  }


  public String getClientType() {
    return clientType;
  }

  public void setClientType(String clientType) {
    this.clientType = clientType;
  }


  public double getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(double grandTotal) {
    this.grandTotal = grandTotal;
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


  public double getCreditMoney() {
    return creditMoney;
  }

  public void setCreditMoney(double creditMoney) {
    this.creditMoney = creditMoney;
  }

}
