package com.hww.common.entity;


public class BsFuncs {

  private long id;
  private String funcName;
  private String funcPath;
  private long typeId;
  private long isShow;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getFuncName() {
    return funcName;
  }

  public void setFuncName(String funcName) {
    this.funcName = funcName;
  }


  public String getFuncPath() {
    return funcPath;
  }

  public void setFuncPath(String funcPath) {
    this.funcPath = funcPath;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public long getIsShow() {
    return isShow;
  }

  public void setIsShow(long isShow) {
    this.isShow = isShow;
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
