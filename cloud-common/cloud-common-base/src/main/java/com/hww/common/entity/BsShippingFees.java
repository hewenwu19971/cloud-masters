package com.hww.common.entity;


public class BsShippingFees {

  private long id;
  private String province;
  private double shippingFee;
  private double conFee;
  private double freeShipping;
  private String mark;
  private double baseWeight;
  private double conWeight;
  private long merchantId;
  private long expId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public double getShippingFee() {
    return shippingFee;
  }

  public void setShippingFee(double shippingFee) {
    this.shippingFee = shippingFee;
  }


  public double getConFee() {
    return conFee;
  }

  public void setConFee(double conFee) {
    this.conFee = conFee;
  }


  public double getFreeShipping() {
    return freeShipping;
  }

  public void setFreeShipping(double freeShipping) {
    this.freeShipping = freeShipping;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public double getBaseWeight() {
    return baseWeight;
  }

  public void setBaseWeight(double baseWeight) {
    this.baseWeight = baseWeight;
  }


  public double getConWeight() {
    return conWeight;
  }

  public void setConWeight(double conWeight) {
    this.conWeight = conWeight;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public long getExpId() {
    return expId;
  }

  public void setExpId(long expId) {
    this.expId = expId;
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
