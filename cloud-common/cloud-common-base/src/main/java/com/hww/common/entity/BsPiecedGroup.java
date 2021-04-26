package com.hww.common.entity;


public class BsPiecedGroup {

  private long id;
  private long goodsId;
  private long groupChiefId;
  private long joinNumber;
  private long status;
  private long successTime;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


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


  public long getGroupChiefId() {
    return groupChiefId;
  }

  public void setGroupChiefId(long groupChiefId) {
    this.groupChiefId = groupChiefId;
  }


  public long getJoinNumber() {
    return joinNumber;
  }

  public void setJoinNumber(long joinNumber) {
    this.joinNumber = joinNumber;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getSuccessTime() {
    return successTime;
  }

  public void setSuccessTime(long successTime) {
    this.successTime = successTime;
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
