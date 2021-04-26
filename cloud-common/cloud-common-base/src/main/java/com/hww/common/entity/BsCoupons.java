package com.hww.common.entity;


public class BsCoupons {

  private long id;
  private long couponId;
  private String couponName;
  private String thumb;
  private double total;
  private long beginTime;
  private long endTime;
  private double condition;
  private String mark;
  private long typeId;
  private String uname;
  private long mid;
  private long status;
  private long merchantId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCouponId() {
    return couponId;
  }

  public void setCouponId(long couponId) {
    this.couponId = couponId;
  }


  public String getCouponName() {
    return couponName;
  }

  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }


  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }


  public long getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(long beginTime) {
    this.beginTime = beginTime;
  }


  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }


  public double getCondition() {
    return condition;
  }

  public void setCondition(double condition) {
    this.condition = condition;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public long getMid() {
    return mid;
  }

  public void setMid(long mid) {
    this.mid = mid;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
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
