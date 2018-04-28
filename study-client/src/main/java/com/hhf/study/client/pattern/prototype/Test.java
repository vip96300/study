package com.hhf.study.client.pattern.prototype;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 15:17 2018/4/23
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype=new Prototype();
        prototype.setStr("1");
        Prototype prototype1=(Prototype) prototype.clone();
        prototype.setStr("2");
        System.err.println(prototype1.getStr());
    }
}
