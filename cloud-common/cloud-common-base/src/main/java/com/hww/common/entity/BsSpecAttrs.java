package com.hww.common.entity;


public class BsSpecAttrs {

  private long id;
  private long specId;
  private String attrName;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSpecId() {
    return specId;
  }

  public void setSpecId(long specId) {
    this.specId = specId;
  }


  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
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
