package com.hhf.study.client.patterns.factory;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:23 2018/4/23
 */
public class MailSender implements Sender{

    @Override
    public void send() {
        System.err.println("send mail");
    }
}
