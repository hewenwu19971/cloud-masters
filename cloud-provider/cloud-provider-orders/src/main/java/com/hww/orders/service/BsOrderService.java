package com.hww.orders.service;

import com.hww.common.entity.BsOrders;

public interface BsOrderService {

    BsOrders findOrderOrdersbByOrderNo(String orderNo);
}
