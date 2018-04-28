package com.hhf.study.client.dao.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 15:57 2018/4/28
 */
@Component
public class DeletedInterceptor {

    private static final Logger log= LoggerFactory.getLogger(DeletedInterceptor.class);

    @After("execution(com.hhf.study.client.dao.*.*(..))")
    public void method(JoinPoint joinPoint){
        log.info("after executed");

    }
}
