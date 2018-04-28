package com.hhf.study.client.patterns.builder;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:53 2018/4/23
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.err.println("send sms");
    }
}
