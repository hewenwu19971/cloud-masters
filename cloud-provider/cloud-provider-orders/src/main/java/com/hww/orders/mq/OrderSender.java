package com.hww.orders.mq;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hww.orders.config.mq.RabbitOrderConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Component
@Slf4j
public class OrderSender implements RabbitTemplate.ConfirmCallback {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    /**
     * 发送消息
     * @param  msg 订单内容，是json字符串
     *  */
    @Transactional
    public void send(String msg) {
        System.out.println(">>>>>>订单微服务：向MQ发送消息>>>>>>" + msg);

        // 构建回调返回的数据（消息id）
        this.rabbitTemplate.setMandatory(true);
        this.rabbitTemplate.setConfirmCallback(this);
        // 封装消息
        Message message = MessageBuilder.withBody(msg.getBytes())
                .setContentType(MessageProperties.CONTENT_TYPE_JSON).setContentEncoding("utf-8")
                .build();
        //推送消息
        rabbitTemplate.convertAndSend(RabbitOrderConfig.NORMAL_EXCHANGE,
                RabbitOrderConfig.NORMAL_ROUTINGKEY,message);
        log.info("生产者发送消息,Exchange={}","routingkey={}",RabbitOrderConfig.NORMAL_EXCHANGE,
                RabbitOrderConfig.NORMAL_ROUTINGKEY);
    }


    //应答机制
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        String jsonString = correlationData.getId();
        System.out.println("消息id:" + correlationData.getId());
        if (ack) {
           log.info(">>>>>>使用MQ消息确认机制确保消息一定要投递到MQ中成功>>>>>>");
            return;
        }
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        // 生产者消息投递失败的话，采用递归重试机制
        send(jsonObject.toJSONString());
        log.info(">>>>>>使用MQ消息确认机制投递到MQ中失败>>>>>>");
    }
}
