package com.hww.orders.controller;

import com.alibaba.fastjson.JSON;
import com.hww.common.Vo.PayVo;
import com.hww.common.Vo.PrepareVo;
import com.hww.common.base.Result;
import com.hww.common.entity.*;
import com.hww.common.utils.SnowFlakeUtil;
import com.hww.orders.mq.OrderSender;
import com.hww.orders.service.impl.AddressesImpl;
import com.hww.orders.service.impl.BsOrderImpl;
import com.hww.orders.service.impl.GoodsOrdersImpl;
import com.hww.orders.service.impl.MemmberImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Slf4j
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private GoodsOrdersImpl goodsOrdersServic;
    @Autowired
    private AddressesImpl addressesServic;
    @Autowired
    private OrderSender orderSender;
    @Autowired
    private MemmberImpl memmberService;
    @Autowired
    private BsOrderImpl bsOrderService;

    /**
     * {products: [{sku_id: 2699, count: "2"}], address: 109, from: "quick", total_price: 252}
     * 提交订单
     *
     * @param prepareVo
     * @return
     */
    @RequestMapping("/confirm")
    public Result confinrm(@RequestBody PrepareVo prepareVo) {

        log.info("这是{}", prepareVo);
        Map<Object, Object> map = new HashMap<>();
        //Get User Id
        String userId = "206";
        //地址
        BsAddresses address = addressesServic.findAddressById(prepareVo.getAddress());

        //商品
        BsOrders bsOrders = new BsOrders();
        bsOrders.setAddress(address.getAddress());
        bsOrders.setArea(address.getArea());
        bsOrders.setProvince(address.getProvince());
        bsOrders.setCity(address.getCity());
        bsOrders.setMid(Long.valueOf(userId));
        bsOrders.setConsignee(address.getName());
        bsOrders.setMobile(address.getMobile());
        bsOrders.setOrderSn(prepareVo.getOrderSn());
        map.put("bsOrders", bsOrders);
        String msg = JSON.toJSONString(map);
        goodsOrdersServic.addOrder(bsOrders);
        orderSender.send(msg);

        map.put("payed", 1);
        return new Result(true, 1, "成功", map);
    }

    /**
     * {cartVos: {sku_id: 2699, count: "2"}, address: 0, from: "quick"}
     * 返回 商品信息，和地址
     *
     * @param prepareVo
     * @return
     */
    @RequestMapping("/prepare")
    public Result prepare(@RequestBody PrepareVo prepareVo) {
        long OrderId = SnowFlakeUtil.getSnowflakeId();//id
        log.info("雪花ID{}",OrderId);
        Map<String, Object> map = new HashMap<>();
        String userId = "206";
        List<Object> list = new ArrayList<>();
        BsOrderGoods bsOrderGoods = new BsOrderGoods();
        BsGoods bsGoods = goodsOrdersServic.findByGoodsId(prepareVo);
        log.info("/prepare;bsgoods={}", bsGoods);
        bsOrderGoods.setMid(Long.valueOf(userId));
        bsOrderGoods.setGoodId(bsGoods.getId());
        bsOrderGoods.setOrderSn(String.valueOf(OrderId));
        bsOrderGoods.setCateId(String.valueOf(bsGoods.getCateId()));
        bsOrderGoods.setGoodName(bsGoods.getGoodName());
        bsOrderGoods.setGoodDes(bsGoods.getGoodDes());
        bsOrderGoods.setGoodNum(prepareVo.getCartVos().getCount());
        bsOrderGoods.setGoodSpec(String.valueOf(prepareVo.getCartVos().getSku_id()));
        bsOrderGoods.setGoodThumb(bsGoods.getGoodThumb());
        bsOrderGoods.setGoodPrice(bsGoods.getSalePrice() * prepareVo.getCartVos().getCount());
        goodsOrdersServic.addGoodsOrder(bsOrderGoods);
        list.add(bsOrderGoods);
        map.put("address", addressesServic.getByAddressesId(userId));
        map.put("products", list);
        return new Result(true, 1, "成功", map);
    }

    @RequestMapping("/pay")
    public Result pay(@RequestBody PayVo payVo) {
        int userId = 3589;
        BsMembers members = memmberService.findPayPwdByUserId(userId);
        log.info("/pay:{}",payVo);
        if (payVo.getPwd().equals(members.getPayPwd())) {
            if (members.getBalance() > payVo.getMoney()) {
                Integer payment = memmberService.payment(payVo, members, userId);
                if (payment > 0) {
                    bsOrderService.modifyOrderStatus(payVo.getOrderSn());
                    return new Result(true, 1, "成功");
                }
                return new Result(false, 2, "系统错误，支付失败");
            }
            return new Result(false, 2, "余额不足");
        }
        return new Result(false, 2, "支付密码错误");
    }
}
