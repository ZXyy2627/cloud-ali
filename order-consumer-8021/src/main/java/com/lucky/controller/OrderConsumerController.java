package com.lucky.controller;

import com.lucky.client.OrderProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @ClassName OrderConsumerController
 * @Description 请描述类的业务用途
 * @Author zhangxiang
 * @Date 2022/8/18
 * @Version 1.0
 **/
@RestController
public class OrderConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderProviderClient orderProviderClient;

    //获取服务名
    @Value("${spring.application.name}")
    private String app_name;

    @GetMapping("/test")
    public String test() {
        return "hello " + app_name;
    }

    @GetMapping("/echo/app-name")
    public String getOrder() {
        String url = "http://localhost:8011/test";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println(response.getBody());
        return response.getBody();
    }

    @GetMapping("/findOrder/{id}")
    public String getOrderById(@PathVariable("id") int id) {
        return orderProviderClient.getOrderById(id);
    }
}
