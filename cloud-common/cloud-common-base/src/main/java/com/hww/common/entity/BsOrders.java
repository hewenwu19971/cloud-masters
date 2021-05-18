package com.hww.common.entity;


import lombok.Data;

import java.util.Date;
@Data
public class BsOrders {

  private long id;
  private String orderSn;
  private double total;
  private long mid;
  private String consignee;
  private String mobile;
  private String province;
  private String city;
  private String area;
  private String address;
  private double expressFee;
  private String expressName;
  private long expressId;
  private String expressCode;
  private long expressPoints;
  private long status;
  private String formId;
  private String perpayId;
  private long payType;
  private String mark;
  private String orderMark;
  private long merchantId;
  private double bonusPrice;
  private long type;
  private long groupStatus;
  private Date groupEffective;
  private long points;
  private String clientType;
  private long isContainTerritory;
  private String cardId;
  private String cardName;
  private String cardMobile;
  private long storeId;
  private Date writeOffTime;
  private Date createdAt;
  private Date updatedAt;
  private long isDraw;
  private long isInvoice;

}
