package com.hww.uc.service;

public interface MailService {
    /**
     * 发送邮件
     * @param to 邮件收件人
     */
     void sendMail(String to);
}
