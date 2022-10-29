package com.lgj.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ConsumerServiceFallback implements ConsumerService{
    @Override
    public String info() {
        log.info("访问失败！");
        return "fail result";
    }
}
