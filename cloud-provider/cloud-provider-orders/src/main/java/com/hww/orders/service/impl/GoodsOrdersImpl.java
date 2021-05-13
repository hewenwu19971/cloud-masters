package com.hww.orders.service.impl;

import com.hww.common.Vo.PrepareVo;
import com.hww.common.entity.BsGoods;
import com.hww.common.entity.BsOrderGoods;
import com.hww.common.entity.BsOrders;
import com.hww.orders.mapper.BsOrderGoodsMapper;
import com.hww.orders.mapper.BsOrdersMapper;
import com.hww.orders.mapper.GoodsMapper;
import com.hww.orders.service.GoodsOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsOrdersImpl implements GoodsOrdersService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private BsOrderGoodsMapper bsOrderGoodsMapper;
    @Autowired
    private BsOrdersMapper bsOrdersMapper;
    @Override
    public BsGoods findByGoodsId(PrepareVo prepareVo) {
        return goodsMapper.selectById(prepareVo.getCartVos().getSku_id());
    }

    @Override
    public Integer addGoodsOrder(BsOrderGoods bsOrderGoods) {
        return bsOrderGoodsMapper.insert(bsOrderGoods);
    }

    @Override
    public Integer addOrder(BsOrders bsOrders) {
        return bsOrdersMapper.insert(bsOrders);
    }
}
