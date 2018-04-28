package com.hhf.study.client.patterns.factory;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:27 2018/4/23
 */
public class SmsSenderFactory implements SenderProvider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
