package com.hww.common.entity;


public class BsMenus {

  private long id;
  private String name;
  private String thumb;
  private String url;
  private long urlType;
  private long sortNum;
  private long merchantId;
  private long menuType;
  private long status;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
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


  public long getSortNum() {
    return sortNum;
  }

  public void setSortNum(long sortNum) {
    this.sortNum = sortNum;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public long getMenuType() {
    return menuType;
  }

  public void setMenuType(long menuType) {
    this.menuType = menuType;
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
