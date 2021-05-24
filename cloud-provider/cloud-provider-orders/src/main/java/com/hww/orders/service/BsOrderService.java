package com.hww.orders.service;

import com.hww.common.entity.BsOrders;

import java.util.List;

public interface BsOrderService {

    BsOrders findOrderOrdersbByOrderNo(String orderNo);

    void modifyOrderStatus(List<String> orderSn);
}
