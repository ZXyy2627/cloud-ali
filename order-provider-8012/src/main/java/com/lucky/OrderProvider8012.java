package com.lucky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderProvider8012
 * @Description 请描述类的业务用途
 * @Author zhangxiang
 * @Date 2022/8/18
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderProvider8012 {

    public static void main(String[] args) {
        SpringApplication.run(OrderProvider8012.class, args);
    }
}
