package com.hww.common.entity;


public class BsWxConfigs {

  private long id;
  private String appid;
  private String appSecret;
  private String mchId;
  private String key;
  private String certClient;
  private String certKey;
  private String payCompTemp;
  private String orderSendTemp;
  private String resNotice;
  private long isGiveAuth;
  private String authorizerRefreshToken;
  private long authStep;
  private String auditid;
  private long wxOnOff;
  private long merchantId;
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


  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }


  public String getMchId() {
    return mchId;
  }

  public void setMchId(String mchId) {
    this.mchId = mchId;
  }


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public String getCertClient() {
    return certClient;
  }

  public void setCertClient(String certClient) {
    this.certClient = certClient;
  }


  public String getCertKey() {
    return certKey;
  }

  public void setCertKey(String certKey) {
    this.certKey = certKey;
  }


  public String getPayCompTemp() {
    return payCompTemp;
  }

  public void setPayCompTemp(String payCompTemp) {
    this.payCompTemp = payCompTemp;
  }


  public String getOrderSendTemp() {
    return orderSendTemp;
  }

  public void setOrderSendTemp(String orderSendTemp) {
    this.orderSendTemp = orderSendTemp;
  }


  public String getResNotice() {
    return resNotice;
  }

  public void setResNotice(String resNotice) {
    this.resNotice = resNotice;
  }


  public long getIsGiveAuth() {
    return isGiveAuth;
  }

  public void setIsGiveAuth(long isGiveAuth) {
    this.isGiveAuth = isGiveAuth;
  }


  public String getAuthorizerRefreshToken() {
    return authorizerRefreshToken;
  }

  public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
    this.authorizerRefreshToken = authorizerRefreshToken;
  }


  public long getAuthStep() {
    return authStep;
  }

  public void setAuthStep(long authStep) {
    this.authStep = authStep;
  }


  public String getAuditid() {
    return auditid;
  }

  public void setAuditid(String auditid) {
    this.auditid = auditid;
  }


  public long getWxOnOff() {
    return wxOnOff;
  }

  public void setWxOnOff(long wxOnOff) {
    this.wxOnOff = wxOnOff;
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
