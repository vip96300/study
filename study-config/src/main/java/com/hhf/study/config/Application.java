package com.hhf.study.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 15:11 2018/3/23
 */
@EnableConfigServer
@SpringCloudApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
