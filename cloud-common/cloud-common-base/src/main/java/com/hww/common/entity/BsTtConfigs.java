package com.hww.common.entity;


public class BsTtConfigs {

  private long id;
  private String ttAppid;
  private String ttSecret;
  private String ttMchId;
  private String ttPayAppid;
  private String ttKey;
  private long merchantId;
  private long ttOnOff;
  private String ttPayCompTemp;
  private String ttOrderSendTemp;
  private String ttResNotice;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTtAppid() {
    return ttAppid;
  }

  public void setTtAppid(String ttAppid) {
    this.ttAppid = ttAppid;
  }


  public String getTtSecret() {
    return ttSecret;
  }

  public void setTtSecret(String ttSecret) {
    this.ttSecret = ttSecret;
  }


  public String getTtMchId() {
    return ttMchId;
  }

  public void setTtMchId(String ttMchId) {
    this.ttMchId = ttMchId;
  }


  public String getTtPayAppid() {
    return ttPayAppid;
  }

  public void setTtPayAppid(String ttPayAppid) {
    this.ttPayAppid = ttPayAppid;
  }


  public String getTtKey() {
    return ttKey;
  }

  public void setTtKey(String ttKey) {
    this.ttKey = ttKey;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public long getTtOnOff() {
    return ttOnOff;
  }

  public void setTtOnOff(long ttOnOff) {
    this.ttOnOff = ttOnOff;
  }


  public String getTtPayCompTemp() {
    return ttPayCompTemp;
  }

  public void setTtPayCompTemp(String ttPayCompTemp) {
    this.ttPayCompTemp = ttPayCompTemp;
  }


  public String getTtOrderSendTemp() {
    return ttOrderSendTemp;
  }

  public void setTtOrderSendTemp(String ttOrderSendTemp) {
    this.ttOrderSendTemp = ttOrderSendTemp;
  }


  public String getTtResNotice() {
    return ttResNotice;
  }

  public void setTtResNotice(String ttResNotice) {
    this.ttResNotice = ttResNotice;
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
