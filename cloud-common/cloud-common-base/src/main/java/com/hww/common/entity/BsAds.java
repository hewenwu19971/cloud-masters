package com.hww.common.entity;


public class BsAds {

  private long id;
  private String title;
  private String url;
  private long urlType;
  private String content;
  private long positionId;
  private long sortNum;
  private long status;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;
  private long merchantId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


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


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public long getUrlType() {
    return urlType;
  }

  public void setUrlType(long urlType) {
    this.urlType = urlType;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getPositionId() {
    return positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }


  public long getSortNum() {
    return sortNum;
  }

  public void setSortNum(long sortNum) {
    this.sortNum = sortNum;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
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
