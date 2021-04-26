package com.hww.common.entity;


public class BsOrderGoods {

  private long id;
  private String orderSn;
  private long goodId;
  private String goodName;
  private double goodPrice;
  private long goodNum;
  private String goodThumb;
  private String specDesc;
  private String goodSpec;
  private String cateId;
  private String cateName;
  private long mid;
  private long typeId;
  private long merchantId;
  private String goodDes;
  private long isTerritory;
  private long orderNum;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


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


  public long getGoodId() {
    return goodId;
  }

  public void setGoodId(long goodId) {
    this.goodId = goodId;
  }


  public String getGoodName() {
    return goodName;
  }

  public void setGoodName(String goodName) {
    this.goodName = goodName;
  }


  public double getGoodPrice() {
    return goodPrice;
  }

  public void setGoodPrice(double goodPrice) {
    this.goodPrice = goodPrice;
  }


  public long getGoodNum() {
    return goodNum;
  }

  public void setGoodNum(long goodNum) {
    this.goodNum = goodNum;
  }


  public String getGoodThumb() {
    return goodThumb;
  }

  public void setGoodThumb(String goodThumb) {
    this.goodThumb = goodThumb;
  }


  public String getSpecDesc() {
    return specDesc;
  }

  public void setSpecDesc(String specDesc) {
    this.specDesc = specDesc;
  }


  public String getGoodSpec() {
    return goodSpec;
  }

  public void setGoodSpec(String goodSpec) {
    this.goodSpec = goodSpec;
  }


  public String getCateId() {
    return cateId;
  }

  public void setCateId(String cateId) {
    this.cateId = cateId;
  }


  public String getCateName() {
    return cateName;
  }

  public void setCateName(String cateName) {
    this.cateName = cateName;
  }


  public long getMid() {
    return mid;
  }

  public void setMid(long mid) {
    this.mid = mid;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(long merchantId) {
    this.merchantId = merchantId;
  }


  public String getGoodDes() {
    return goodDes;
  }

  public void setGoodDes(String goodDes) {
    this.goodDes = goodDes;
  }


  public long getIsTerritory() {
    return isTerritory;
  }

  public void setIsTerritory(long isTerritory) {
    this.isTerritory = isTerritory;
  }


  public long getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(long orderNum) {
    this.orderNum = orderNum;
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
