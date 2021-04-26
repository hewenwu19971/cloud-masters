package com.hww.common.entity;


public class BsPoints {

  private long id;
  private long type;
  private long mId;
  private String des;
  private String orderSn;
  private long status;
  private long total;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }


  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
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
