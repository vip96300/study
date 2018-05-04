package com.hhf.study.client.controller;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 16:20 2018/3/26
 */
public class BaseController {

    /**
     * 访问受限
     */
    public static final int ACCESS_RESTRICTED=9998;
    /**
     * 发生异常
     */
    public static final int EXCEPTION=9999;
    /**
     * 记录未找到
     */
    public static final int RECORD_NOT_FOUND=1000;
    /**
     * 记录已删除
     */
    public static final int RECORD_DELETED=1001;
    /**
     * 记录未启用
     */
    public static final int RECORD_NOT_ENABLED=1002;
    /**
     * 成功
     */
    protected static final int SUCCESS=200;
    
}
