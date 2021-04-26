package com.hww.common.entity;


public class BsUlevels {

  private long id;
  private String levelName;
  private long points;
  private long agio;
  private String thumb;
  private String infoColor;
  private String dataColor;
  private String levelColor;
  private long merchantId;
  private long sortNum;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLevelName() {
    return levelName;
  }

  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }


  public long getPoints() {
    return points;
  }

  public void setPoints(long points) {
    this.points = points;
  }


  public long getAgio() {
    return agio;
  }

  public void setAgio(long agio) {
    this.agio = agio;
  }


  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }


  public String getInfoColor() {
    return infoColor;
  }

  public void setInfoColor(String infoColor) {
    this.infoColor = infoColor;
  }


  public String getDataColor() {
    return dataColor;
  }

  public void setDataColor(String dataColor) {
    this.dataColor = dataColor;
  }


  public String getLevelColor() {
    return levelColor;
  }

  public void setLevelColor(String levelColor) {
    this.levelColor = levelColor;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public long getSortNum() {
    return sortNum;
  }

  public void setSortNum(long sortNum) {
    this.sortNum = sortNum;
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
