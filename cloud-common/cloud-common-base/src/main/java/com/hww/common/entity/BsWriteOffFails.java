package com.hww.common.entity;


public class BsWriteOffFails {

  private long id;
  private String orderSn;
  private double total;
  private long mid;
  private long storeId;
  private java.sql.Timestamp writeOffTime;
  private String failInfo;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }


  public long getMid() {
    return mid;
  }

  public void setMid(long mid) {
    this.mid = mid;
  }


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public java.sql.Timestamp getWriteOffTime() {
    return writeOffTime;
  }

  public void setWriteOffTime(java.sql.Timestamp writeOffTime) {
    this.writeOffTime = writeOffTime;
  }


  public String getFailInfo() {
    return failInfo;
  }

  public void setFailInfo(String failInfo) {
    this.failInfo = failInfo;
  }

}
