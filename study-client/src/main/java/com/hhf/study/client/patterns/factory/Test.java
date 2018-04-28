package com.hhf.study.client.patterns.factory;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:28 2018/4/23
 */
public class Test {

    public static void main(String[] args) {
        SenderProvider senderProvider=new MailSenderFactory();
        Sender sender=senderProvider.produce();
        sender.send();
    }
}
