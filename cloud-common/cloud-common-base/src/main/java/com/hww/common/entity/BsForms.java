package com.hww.common.entity;


public class BsForms {

  private long id;
  private long merchantId;
  private long memberId;
  private long formId;
  private String formValue;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private String scene;
  private String title;
  private String desc;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public long getFormId() {
    return formId;
  }

  public void setFormId(long formId) {
    this.formId = formId;
  }


  public String getFormValue() {
    return formValue;
  }

  public void setFormValue(String formValue) {
    this.formValue = formValue;
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


  public String getScene() {
    return scene;
  }

  public void setScene(String scene) {
    this.scene = scene;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

}
