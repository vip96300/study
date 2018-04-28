package com.hhf.study.client.service.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 15:57 2018/4/28
 */
@Aspect
@Component
public class ServiceInterceptor {

    private static final Logger log= LoggerFactory.getLogger(ServiceInterceptor.class);

    @After("execution(* com.hhf.study.client.service.*.*(..))")
    public void method(JoinPoint joinPoint){
        log.info("method:{},args:{}",joinPoint.getStaticPart().getId(), Arrays.asList(joinPoint.getArgs()).toString());
    }
}
