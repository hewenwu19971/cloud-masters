package com.hww.common.entity;


public class BsMusics {

  private long id;
  private String musicName;
  private String musicSinger;
  private String musicUrl;
  private long merchantId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getMusicName() {
    return musicName;
  }

  public void setMusicName(String musicName) {
    this.musicName = musicName;
  }


  public String getMusicSinger() {
    return musicSinger;
  }

  public void setMusicSinger(String musicSinger) {
    this.musicSinger = musicSinger;
  }


  public String getMusicUrl() {
    return musicUrl;
  }

  public void setMusicUrl(String musicUrl) {
    this.musicUrl = musicUrl;
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
