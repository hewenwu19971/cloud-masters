package com.hww.ms.service;

import com.hww.common.entity.BsGoods;

public interface GoodsService {
    BsGoods findByGoodsId(Long id);
    void deductionOfInventory (BsGoods bsGoods);
}
