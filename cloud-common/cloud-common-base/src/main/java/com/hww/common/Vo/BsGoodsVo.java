package com.hww.common.Vo;

import com.hww.common.entity.BsGoods;
import lombok.Data;

import java.util.List;

@Data
public class BsGoodsVo {
    private Integer current;
    private Integer size;
    private Long total;
    private List<BsGoods> goodsList;
    private Long pages;
}
