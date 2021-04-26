package com.hww.common.entity;


public class BsPrizes {

  private long id;
  private String prizeName;
  private long probability;
  private String thumb;
  private long num;
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


  public String getPrizeName() {
    return prizeName;
  }

  public void setPrizeName(String prizeName) {
    this.prizeName = prizeName;
  }


  public long getProbability() {
    return probability;
  }

  public void setProbability(long probability) {
    this.probability = probability;
  }


  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
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
