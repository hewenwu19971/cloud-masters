package com.hww.common.entity;


public class BsRescueStaffs {

  private long id;
  private long merchantId;
  private String name;
  private String mobile;
  private long status;
  private long isFocus;
  private long handleEventNum;
  private String workerDay;
  private String workerStime;
  private String workerEtime;
  private String openid;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private long memberId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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


  public long getIsFocus() {
    return isFocus;
  }

  public void setIsFocus(long isFocus) {
    this.isFocus = isFocus;
  }


  public long getHandleEventNum() {
    return handleEventNum;
  }

  public void setHandleEventNum(long handleEventNum) {
    this.handleEventNum = handleEventNum;
  }


  public String getWorkerDay() {
    return workerDay;
  }

  public void setWorkerDay(String workerDay) {
    this.workerDay = workerDay;
  }


  public String getWorkerStime() {
    return workerStime;
  }

  public void setWorkerStime(String workerStime) {
    this.workerStime = workerStime;
  }


  public String getWorkerEtime() {
    return workerEtime;
  }

  public void setWorkerEtime(String workerEtime) {
    this.workerEtime = workerEtime;
  }


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
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


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }

}
