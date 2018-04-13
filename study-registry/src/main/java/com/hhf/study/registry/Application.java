package com.hhf.study.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 15:11 2018/3/23
 */
@EnableEurekaServer
@SpringCloudApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
