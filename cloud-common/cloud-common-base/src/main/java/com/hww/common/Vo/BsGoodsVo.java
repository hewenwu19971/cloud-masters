package com.hww.common.Vo;

import com.hww.common.entity.BsGoods;
import lombok.Data;

import java.util.List;

@Data
public class BsGoodsVo<T> {
    private long catesid;
    private Integer current;
    private Integer size;
    private Long total;
    private List<T> goodsList;
    private Long pages;
}
