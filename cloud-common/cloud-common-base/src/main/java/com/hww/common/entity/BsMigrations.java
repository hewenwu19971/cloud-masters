package com.hww.common.entity;


public class BsMigrations {

  private long id;
  private String migration;
  private long batch;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getMigration() {
    return migration;
  }

  public void setMigration(String migration) {
    this.migration = migration;
  }


  public long getBatch() {
    return batch;
  }

  public void setBatch(long batch) {
    this.batch = batch;
  }

}
