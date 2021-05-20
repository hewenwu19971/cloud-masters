package com.hww.common.entity;

import lombok.Data;

@Data
public class BsMembers {

  private long id;
  private String name;
  private String headerImg;
  private String openid;
  private String mobile;
  private long status;
  private String allSuperiors;
  private long superiorId;
  private long points;
  private double balance;
  private double percentage;
  private long levelPoints;
  private long merchantId;
  private String payPwd;
  private String vipCard;
  private String clientType;
  private double grandTotal;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private double creditMoney;
  private int userId;
  private String password;

}
