package com.hww.common.Vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PayVo implements Serializable {
private String pwd;
private List<String> orderSn;
private double money;
}
