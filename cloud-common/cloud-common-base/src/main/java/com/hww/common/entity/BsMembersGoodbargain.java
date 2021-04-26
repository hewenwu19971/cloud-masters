package com.hww.common.entity;


public class BsMembersGoodbargain {

  private long id;
  private long merchantId;
  private long goodsId;
  private String specsName;
  private long specsPrice;
  private long memberId;
  private long bargainPrice;
  private double lowBargainPrice;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private long cutCount;
  private double cutTimes;
  private long selfCut;
  private long minCutPrice;
  private long maxCutPrice;
  private long status;
  private long startTime;
  private long endTime;


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


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getSpecsName() {
    return specsName;
  }

  public void setSpecsName(String specsName) {
    this.specsName = specsName;
  }


  public long getSpecsPrice() {
    return specsPrice;
  }

  public void setSpecsPrice(long specsPrice) {
    this.specsPrice = specsPrice;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public long getBargainPrice() {
    return bargainPrice;
  }

  public void setBargainPrice(long bargainPrice) {
    this.bargainPrice = bargainPrice;
  }


  public double getLowBargainPrice() {
    return lowBargainPrice;
  }

  public void setLowBargainPrice(double lowBargainPrice) {
    this.lowBargainPrice = lowBargainPrice;
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


  public long getCutCount() {
    return cutCount;
  }

  public void setCutCount(long cutCount) {
    this.cutCount = cutCount;
  }


  public double getCutTimes() {
    return cutTimes;
  }

  public void setCutTimes(double cutTimes) {
    this.cutTimes = cutTimes;
  }


  public long getSelfCut() {
    return selfCut;
  }

  public void setSelfCut(long selfCut) {
    this.selfCut = selfCut;
  }


  public long getMinCutPrice() {
    return minCutPrice;
  }

  public void setMinCutPrice(long minCutPrice) {
    this.minCutPrice = minCutPrice;
  }


  public long getMaxCutPrice() {
    return maxCutPrice;
  }

  public void setMaxCutPrice(long maxCutPrice) {
    this.maxCutPrice = maxCutPrice;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }


  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }

}
