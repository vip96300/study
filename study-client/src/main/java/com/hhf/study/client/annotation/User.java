package com.hhf.study.client.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 15:04 2018/3/26
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface User {

    String[] roles() default {};

    String[] permissions() default {};

}
