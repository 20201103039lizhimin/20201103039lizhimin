package com.example.demo001.controller;

import com.example.demo001.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmailController {
    @Autowired
    private EmailService emailService;
    @RequestMapping("/send")
    public Boolean send(){
        // 设置收件人邮箱
        String to = "1767455093@qq.com";
        // 设置邮件标题
        String title = "测试邮件";
        // 设置邮件内容
        String content = "这是一封测试邮件";
        // 调用emailService的send方法发送邮件，并返回发送结果
        boolean flag = emailService.send(to,title,content);
        // 返回发送结果
        return flag;
    }

}
