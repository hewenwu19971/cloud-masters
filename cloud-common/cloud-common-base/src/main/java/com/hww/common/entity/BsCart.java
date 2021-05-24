package com.hww.common.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class BsCart implements Serializable {

    private long id;
    private long count;
    private long skuId;
    private String specsId;
    private String specsAttrsId;
    private java.sql.Timestamp createdAt;
    private long userId;
    private double price;
}
