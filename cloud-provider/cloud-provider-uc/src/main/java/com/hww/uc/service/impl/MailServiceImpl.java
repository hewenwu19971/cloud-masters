package com.hww.uc.service.impl;

import com.hww.uc.service.MailService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
@Slf4j
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender mailSender;

    //邮件发件人
    @Value("${mail.fromMail.addr}")
    private String from;


    @Override
    public void sendMail(String to) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);//是谁发送的
        message.setTo(to);//发送给谁
        message.setSubject("验证码");//标题
        message.setText("欢迎注册商城账号，您的验证码为 "+this.randomInteger()+" 请不要发给他人。");//内容
        mailSender.send(message);
        log.info("邮件发送成功！");
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
