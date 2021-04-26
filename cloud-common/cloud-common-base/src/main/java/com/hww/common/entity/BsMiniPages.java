package com.hww.common.entity;


public class BsMiniPages {

  private long id;
  private String pageName;
  private String pageUrl;
  private long status;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }


  public String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
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
