package com.hww.common.entity;


public class BsFailedJobs {

  private long id;
  private String connection;
  private String queue;
  private String payload;
  private String exception;
  private java.sql.Timestamp failedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }


  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }


  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }


  public java.sql.Timestamp getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(java.sql.Timestamp failedAt) {
    this.failedAt = failedAt;
  }

}
