package com.hww.ms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.entity.BsGoods;
import com.hww.ms.mapper.GoodsMapper;
import com.hww.ms.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public BsGoods findByGoodsId(Long id) {
        return goodsMapper.selectById(id);
    }

    @Override
    public void deductionOfInventory(BsGoods bsGoods) {
        QueryWrapper<BsGoods> query = Wrappers.query();
        query.eq("id",bsGoods.getId());
        goodsMapper.update(bsGoods,query);
    }
}
