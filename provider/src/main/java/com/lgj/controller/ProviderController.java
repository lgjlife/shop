package com.lgj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Slf4j
public class ProviderController {

    @RequestMapping("/info")
    public String info(){


        log.info("消费者访问");


        return "消费者:" + new Random().nextInt(100);
    }
}
