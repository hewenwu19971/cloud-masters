package com.hww.common.Vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PrepareVo {
    private List<CartVo> cartVos;
    private String from;
    private String address;
    private double total_price;
    private String orderSn;
    private String count;
    private String specsAttrsId;
}
