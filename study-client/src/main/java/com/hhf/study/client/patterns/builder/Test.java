package com.hhf.study.client.patterns.builder;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:58 2018/4/23
 */
public class Test {

    public static void main(String[] args) {
        new SenderBuilder().produceMailSender(10);
    }
}
