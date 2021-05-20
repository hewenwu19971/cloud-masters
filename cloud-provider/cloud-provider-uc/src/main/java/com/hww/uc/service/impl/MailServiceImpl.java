package com.hww.uc.service.impl;

import com.hww.uc.service.MailService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private StringRedisTemplate redisTemplate;

    //邮件发件人
    @Value("${mail.fromMail.addr}")
    private String from;


    @Override
    public void sendMail(String to) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);//是谁发送的
        message.setTo(to);//发送给谁
        message.setSubject("文武集团会员注册邮箱验证");//标题
       // message.setCc(from);
        String s = this.randomInteger();
        message.setText("欢迎注册文武集团会员，您的验证码为 "+s+" 请不要发给他人。" + new Date());//内容
        redisTemplate.opsForValue().set(to+"_mail",s,60, TimeUnit.SECONDS);
        mailSender.send(message);
        log.info("邮件发送成功！{}",s);
    }


    private String randomInteger() {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        //生成6位的随机数
        for (int i = 0;i<6;i++){
            int i1 = random.nextInt(10);
            stringBuffer.append(i1);
        }
        return stringBuffer.toString();
    }
}
