package com.hhf.study.client.patterns.adapter;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:47 2018/4/24
 */
public class Test {

    public static void main(String[] args) {
        //对象适配器模式
        Target target=new Adapter();
        target.operate1();
        target.operate2();
        //类适配器模式
        Adaptee adaptee=new Adaptee();
        new Adapter1(adaptee).operate1();
        new Adapter1(adaptee).operate2();
    }
}
