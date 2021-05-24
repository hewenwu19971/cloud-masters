package com.hww.common.entity;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class BsOrderGoods implements Serializable {

  private long id;
  private String orderSn;
  private long goodId;
  private String goodName;
  private double goodPrice;
  private long goodNum;
  private String goodThumb;
  private String specDesc;
  private String goodSpec;
  private String cateId;
  private String cateName;
  private long mid;
  private long typeId;
  private long merchantId;
  private String goodDes;
  private long isTerritory;
  private long orderNum;
  private Date createdAt;
  private Date updatedAt;


}
