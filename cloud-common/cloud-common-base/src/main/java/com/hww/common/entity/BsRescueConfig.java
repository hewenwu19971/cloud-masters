package com.hww.common.entity;


public class BsRescueConfig {

  private long id;
  private String appid;
  private String secret;
  private long merchantId;
  private String template;
  private long accept;
  private long staffId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }


  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  public long getAccept() {
    return accept;
  }

  public void setAccept(long accept) {
    this.accept = accept;
  }


  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
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
