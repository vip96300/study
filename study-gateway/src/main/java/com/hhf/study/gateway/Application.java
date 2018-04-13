package com.hhf.study.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 15:15 2018/3/23
 */
@EnableZuulServer
@SpringCloudApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
