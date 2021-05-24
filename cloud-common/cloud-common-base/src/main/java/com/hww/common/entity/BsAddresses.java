package com.hww.common.entity;


import lombok.Data;

import java.io.Serializable;
@Data
public class BsAddresses implements Serializable {

  private long id;
  private long mId;
  private String name;
  private String mobile;
  private String province;
  private String city;
  private String area;
  private String address;
  private long isDefault;
  private long merchantId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;

}
