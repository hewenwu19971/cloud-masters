package com.hww.common.entity;


public class BsCommunityDynamic {

  private long id;
  private long merchantId;
  private long memberId;
  private long goodsId;
  private String content;
  private String images;
  private long praiseNumber;
  private long status;
  private String errReason;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


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


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getImages() {
    return images;
  }

  public void setImages(String images) {
    this.images = images;
  }


  public long getPraiseNumber() {
    return praiseNumber;
  }

  public void setPraiseNumber(long praiseNumber) {
    this.praiseNumber = praiseNumber;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getErrReason() {
    return errReason;
  }

  public void setErrReason(String errReason) {
    this.errReason = errReason;
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
