package com.hww.common.entity;


public class BsInvoices {

  private long id;
  private long type;
  private long payableType;
  private String payable;
  private String dutyParagraph;
  private String openingBank;
  private String bankNumber;
  private String address;
  private String tel;
  private long mid;
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


  public long getPayableType() {
    return payableType;
  }

  public void setPayableType(long payableType) {
    this.payableType = payableType;
  }


  public String getPayable() {
    return payable;
  }

  public void setPayable(String payable) {
    this.payable = payable;
  }


  public String getDutyParagraph() {
    return dutyParagraph;
  }

  public void setDutyParagraph(String dutyParagraph) {
    this.dutyParagraph = dutyParagraph;
  }


  public String getOpeningBank() {
    return openingBank;
  }

  public void setOpeningBank(String openingBank) {
    this.openingBank = openingBank;
  }


  public String getBankNumber() {
    return bankNumber;
  }

  public void setBankNumber(String bankNumber) {
    this.bankNumber = bankNumber;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public long getMid() {
    return mid;
  }

  public void setMid(long mid) {
    this.mid = mid;
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
