package com.hww.orders.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.entity.BsOrders;
import com.hww.orders.mapper.BsOrdersMapper;
import com.hww.orders.service.BsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BsOrderImpl implements BsOrderService {
    @Autowired
    private BsOrdersMapper bsOrdersMapper;

    @Override
    public BsOrders findOrderOrdersbByOrderNo(String orderNo) {
        QueryWrapper<BsOrders> query = Wrappers.query();
        query.eq("order_sn",orderNo);
        return bsOrdersMapper.selectOne(query);
    }
}
