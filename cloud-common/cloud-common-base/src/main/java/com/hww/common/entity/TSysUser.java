package com.hww.common.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TSysUser {

  private long id;
  private String username;
  private String password;
  private String nickName;
  private String salt;
  private String token;
  private java.sql.Timestamp gmtCreate;
  private java.sql.Timestamp gmtModified;
  private String avatar;
  private String tel;
  private String name;
  private String gender;
  private String district;
  private Date birthday;
  private String payPwd;
  private double balance;

}
