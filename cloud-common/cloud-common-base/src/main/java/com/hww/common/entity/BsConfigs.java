package com.hww.common.entity;


public class BsConfigs {

  private long id;
  private String config;
  private String val;
  private long sortNum;
  private long type;
  private String conAlias;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }


  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }


  public long getSortNum() {
    return sortNum;
  }

  public void setSortNum(long sortNum) {
    this.sortNum = sortNum;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getConAlias() {
    return conAlias;
  }

  public void setConAlias(String conAlias) {
    this.conAlias = conAlias;
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
