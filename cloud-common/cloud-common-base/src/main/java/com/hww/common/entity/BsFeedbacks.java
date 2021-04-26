package com.hww.common.entity;


public class BsFeedbacks {

  private long id;
  private String title;
  private String images;
  private String des;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private long merchantId;
  private String merchantMob;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getImages() {
    return images;
  }

  public void setImages(String images) {
    this.images = images;
  }


  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
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


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public String getMerchantMob() {
    return merchantMob;
  }

  public void setMerchantMob(String merchantMob) {
    this.merchantMob = merchantMob;
  }

}
