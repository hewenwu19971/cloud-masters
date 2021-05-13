package com.hww.orders.mq;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;
import com.hww.common.entity.BsOrders;
import com.hww.orders.mapper.BsOrdersMapper;
import com.hww.orders.service.impl.GoodsOrdersImpl;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

/** 接收订单消息队列中的消息 */
@Component
@Slf4j
public class OrderReceiver {

    @Autowired
    private GoodsOrdersImpl goodsOrders;
    //接收队列的信息
    @RabbitListener(queues = {"normar-queue"})
    @RabbitHandler
    public void handleMessage(Message msg, Channel channel) throws IOException {

        try {
            log.info("普通消费者接收到了消息,ts={}", LocalDateTime.now().toString());
            Map map = JSON.parseObject(msg.getBody(), Map.class);

            Object bsOrders =  map.get("bsOrders");
            log.info("bsOrders：{}",bsOrders.toString());
            BsOrders bsOrders1 = JSONObject.parseObject(bsOrders.toString(), BsOrders.class);

            goodsOrders.addOrder(bsOrders1);
           //channel.basicAck(msg.getMessageProperties().getDeliveryTag(),false);
            //channel.basicNack(msg.getMessageProperties().getDeliveryTag(),false,false);
        } catch (Exception e) {
            channel.basicNack(msg.getMessageProperties().getDeliveryTag(),false,false);
            e.printStackTrace();
        }

    }

    //告诉服务器收到这条消息 已经被我消费了 可以在队列删掉 这样以后就不会再发了
    // 否则消息服务器以为这条消息没处理掉 后续还会在发
    private void basicNack(Message message, Channel channel) throws IOException {
        channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
    }

    /**
     * 判断订单是否保存过
     * @param orderSave
     * @return
     */
//    public boolean isProcess(List<OrderSave> orderSave){
//        boolean flag = true ;
//        for(OrderSave o:orderSave){
//            //订单
//            Order order = o.getOrder() ;
//            //订单编号
//            String orderNo = order.getOrderNo() ;
//            //根据订单编号查询订单是否存在
//            Order od = orderService.getOrderByOrderNo(orderNo) ;
//            if(od==null){
//                flag = false ;
//                break;
//            }
//        }
//        return flag ;
//    }flag

}

