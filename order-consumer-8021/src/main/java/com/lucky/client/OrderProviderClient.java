package com.lucky.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName OrderProviderClient
 * @Description 请描述类的业务用途
 * @Author zhangxiang
 * @Date 2022/8/18
 * @Version 1.0
 **/
@FeignClient("order-provider")
public interface OrderProviderClient {

    @GetMapping("/order/{id}")
    String getOrderById(@PathVariable("id") int id);
}
