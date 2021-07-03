package com.hww.orders.controller;

import com.hww.common.Vo.PayVo;
import com.hww.common.base.Result;
import com.hww.common.entity.BsOrders;
import com.hww.orders.service.impl.BsOrderImpl;
import com.hww.orders.service.impl.GoodsOrdersImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class MemberController {
    @Autowired
    private BsOrderImpl bsOrderService;

    @Autowired
    private GoodsOrdersImpl goodsOrdersServic;

    @PostMapping("/order/view")
    public Result orderDetail(@RequestBody PayVo payVo) {
        log.info("BsOrders:{}", payVo);
        List<Object> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        for (int i = 0; i < payVo.getOrderSn().size(); i++) {
            list.add(goodsOrdersServic.findOrderOrdersbByOrderNo(payVo.getOrderSn().get(i)));
            list2.add(bsOrderService.findOrderOrdersbByOrderNo(payVo.getOrderSn().get(i)));
        }
        Map<String, Object> map = new HashMap<>();
        map.put("bsOrders", list2);
        map.put("goodsOrder", list);
        return new Result(true, 1, "成功", map);
    }
}
