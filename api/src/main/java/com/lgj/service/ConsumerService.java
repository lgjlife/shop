package com.lgj.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "shop-provider",fallback = ConsumerServiceFallback.class)
public interface ConsumerService {

    @RequestMapping("/info")
    public String info();


}
