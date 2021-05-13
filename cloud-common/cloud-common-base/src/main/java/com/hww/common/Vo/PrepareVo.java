package com.hww.common.Vo;

import lombok.Data;

import java.util.List;

@Data
public class PrepareVo {
    private CartVo cartVos;
    private String from;
    private String address;
    private String total_price;
    private String orderSn;
}
