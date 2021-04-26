package com.hww.common.entity;


public class BsRecharges {

  private long id;
  private double total;
  private long mId;
  private long type;
  private String orderSn;
  private String des;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
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
