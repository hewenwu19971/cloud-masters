package com.hww.common.entity;


public class BsTemplatePreviews {

  private long id;
  private String name;
  private double fee;
  private String previewImg;
  private String pageList;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getFee() {
    return fee;
  }

  public void setFee(double fee) {
    this.fee = fee;
  }


  public String getPreviewImg() {
    return previewImg;
  }

  public void setPreviewImg(String previewImg) {
    this.previewImg = previewImg;
  }


  public String getPageList() {
    return pageList;
  }

  public void setPageList(String pageList) {
    this.pageList = pageList;
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
