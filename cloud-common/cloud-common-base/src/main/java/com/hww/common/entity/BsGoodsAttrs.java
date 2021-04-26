package com.hww.common.entity;


public class BsGoodsAttrs {

  private long id;
  private long goodsId;
  private long specId;
  private String specName;
  private String attrId;
  private String attrName;
  private String thumb;
  private double price;
  private long version;
  private String createdAt;
  private String updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getSpecId() {
    return specId;
  }

  public void setSpecId(long specId) {
    this.specId = specId;
  }


  public String getSpecName() {
    return specName;
  }

  public void setSpecName(String specName) {
    this.specName = specName;
  }


  public String getAttrId() {
    return attrId;
  }

  public void setAttrId(String attrId) {
    this.attrId = attrId;
  }


  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }


  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

}
