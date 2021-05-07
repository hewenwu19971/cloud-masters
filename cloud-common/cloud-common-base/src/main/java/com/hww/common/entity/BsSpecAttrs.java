package com.hww.common.entity;

import lombok.Data;

@Data
public class BsSpecAttrs {

  private long id;
  private long specId;
  private String attrName;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


}
