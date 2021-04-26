package com.hww.common.entity;


public class BsMiniTars {

  private long id;
  private String tarPath;
  private String tarIconPath;
  private String tarSelectIconPath;
  private String tarText;
  private long defaults;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTarPath() {
    return tarPath;
  }

  public void setTarPath(String tarPath) {
    this.tarPath = tarPath;
  }


  public String getTarIconPath() {
    return tarIconPath;
  }

  public void setTarIconPath(String tarIconPath) {
    this.tarIconPath = tarIconPath;
  }


  public String getTarSelectIconPath() {
    return tarSelectIconPath;
  }

  public void setTarSelectIconPath(String tarSelectIconPath) {
    this.tarSelectIconPath = tarSelectIconPath;
  }


  public String getTarText() {
    return tarText;
  }

  public void setTarText(String tarText) {
    this.tarText = tarText;
  }


  public long getDefault() {
    return defaults;
  }

  public void setDefault(long defaults) {
    this.defaults = defaults;
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
