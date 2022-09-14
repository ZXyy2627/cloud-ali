package com.lucky.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description 请描述类的业务用途
 * @Author zhangxiang
 * @Date 2022/8/18
 * @Version 1.0
 **/
@RestController
public class OrderController {


    @Value("${server.port}")
    private int port;

    @GetMapping("/test")
    public String test() {
        return "Hello Nacos Discovery";
    }

    @GetMapping("/order/{id}")
    public String getOrderById(@PathVariable("id") int id) {
        System.out.println("调用远程服务" + port);
        return "order 8011" + ",id:"+id;
    }
}
