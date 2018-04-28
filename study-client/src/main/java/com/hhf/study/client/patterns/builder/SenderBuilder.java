package com.hhf.study.client.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:54 2018/4/23
 */
public class SenderBuilder {

    public List<Sender> senderList=new ArrayList<>();

    public void produceMailSender(int count){
        for(int i=0;i<count;i++){
            senderList.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0;i<count;i++){
            senderList.add(new SmsSender());
        }
    }
}
