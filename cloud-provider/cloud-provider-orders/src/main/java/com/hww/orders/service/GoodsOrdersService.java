package com.hww.orders.service;

import com.hww.common.Vo.PrepareVo;
import com.hww.common.entity.BsGoods;
import com.hww.common.entity.BsOrderGoods;
import com.hww.common.entity.BsOrders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


public interface GoodsOrdersService {

     BsGoods findByGoodsId(PrepareVo prepareVo);
     Integer addGoodsOrder(BsOrderGoods bsOrderGoods);
     Integer addOrder(BsOrders bsOrders);

    Object findOrderOrdersbByOrderNo(String toString);
}
