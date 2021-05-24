package com.hww.common.Vo;

import lombok.Data;

import java.util.List;

@Data
public class PayVo {
private String pwd;
private List<String> orderSn;
private double money;
}
