package com.hww.common.entity;


public class BsMerchantForms {

  private long id;
  private long merchantId;
  private String title;
  private String mark;
  private String desc;
  private String field;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private long status;
  private long login;
  private String backColor;
  private String banner;
  private String footer;
  private String submit;
  private long submitCount;
  private String formUrl;


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


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }


  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
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


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getLogin() {
    return login;
  }

  public void setLogin(long login) {
    this.login = login;
  }


  public String getBackColor() {
    return backColor;
  }

  public void setBackColor(String backColor) {
    this.backColor = backColor;
  }


  public String getBanner() {
    return banner;
  }

  public void setBanner(String banner) {
    this.banner = banner;
  }


  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }


  public String getSubmit() {
    return submit;
  }

  public void setSubmit(String submit) {
    this.submit = submit;
  }


  public long getSubmitCount() {
    return submitCount;
  }

  public void setSubmitCount(long submitCount) {
    this.submitCount = submitCount;
  }


  public String getFormUrl() {
    return formUrl;
  }

  public void setFormUrl(String formUrl) {
    this.formUrl = formUrl;
  }

}
