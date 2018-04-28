package com.hhf.study.client.patterns.adapter;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:43 2018/4/24
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void operate2() {
        System.err.println("operate2");
    }
}
