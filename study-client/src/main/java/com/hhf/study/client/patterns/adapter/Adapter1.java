package com.hhf.study.client.patterns.adapter;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:52 2018/4/24
 */
public class Adapter1 {

    private Adaptee adaptee;
    public Adapter1(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    public void operate1(){
        adaptee.operate1();
    }

    public void operate2(){
        System.err.println("operate2");
    }
}
