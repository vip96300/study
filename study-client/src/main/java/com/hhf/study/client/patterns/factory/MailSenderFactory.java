package com.hhf.study.client.patterns.factory;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:26 2018/4/23
 */
public class MailSenderFactory implements SenderProvider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
