package com.example.demo001.service.impl;

import com.example.demo001.pojo.EmailProperties;
import com.example.demo001.utils.MailUtil;

public class EmailServiceImpl implements EmailService{
    private EmailProperties emailProperties;
    /**
     * 发送邮件
     * @param to 邮件接收方
     * @param title 邮件标题
     * @param content 邮件内容
     * @return 发送成功返回true，否则返回false
     */
    public boolean send(String to, String title, String content) {
        System.out.println(emailProperties);
        boolean flag = MailUtil.sendMail(emailProperties, to, title, content);
        return flag;
    }

}
