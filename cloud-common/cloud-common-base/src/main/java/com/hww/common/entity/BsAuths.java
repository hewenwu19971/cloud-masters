package com.hww.common.entity;


public class BsAuths {

  private long id;
  private String name;
  private long levelId;
  private String routerName;
  private long topId;
  private long showif;
  private String icon;
  private long sortNum;
  private String topRouter;
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


  public long getLevelId() {
    return levelId;
  }

  public void setLevelId(long levelId) {
    this.levelId = levelId;
  }


  public String getRouterName() {
    return routerName;
  }

  public void setRouterName(String routerName) {
    this.routerName = routerName;
  }


  public long getTopId() {
    return topId;
  }

  public void setTopId(long topId) {
    this.topId = topId;
  }


  public long getShowif() {
    return showif;
  }

  public void setShowif(long showif) {
    this.showif = showif;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public long getSortNum() {
    return sortNum;
  }

  public void setSortNum(long sortNum) {
    this.sortNum = sortNum;
  }


  public String getTopRouter() {
    return topRouter;
  }

  public void setTopRouter(String topRouter) {
    this.topRouter = topRouter;
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
