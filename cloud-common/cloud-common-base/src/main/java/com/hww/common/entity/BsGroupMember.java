package com.hww.common.entity;


public class BsGroupMember {

  private long id;
  private long groupId;
  private long mid;
  private long isChief;
  private long joinTime;
  private String orderSn;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getGroupId() {
    return groupId;
  }

  public void setGroupId(long groupId) {
    this.groupId = groupId;
  }


  public long getMid() {
    return mid;
  }

  public void setMid(long mid) {
    this.mid = mid;
  }


  public long getIsChief() {
    return isChief;
  }

  public void setIsChief(long isChief) {
    this.isChief = isChief;
  }


  public long getJoinTime() {
    return joinTime;
  }

  public void setJoinTime(long joinTime) {
    this.joinTime = joinTime;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }

}
