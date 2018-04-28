package com.hhf.study.client.patterns.singleton;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:38 2018/4/23
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    private static synchronized void init(){
        if(instance==null){
            instance=new Singleton();
        }
    }

    public static Singleton getInstance(){
        if(instance==null){
            Singleton.init();
        }
        return instance;
    }
}
