package com.hww.common.entity;


public class BsLiveSmiles {

  private long id;
  private String title;
  private long status;
  private String picture;
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


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
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
