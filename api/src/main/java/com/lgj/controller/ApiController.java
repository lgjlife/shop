package com.lgj.controller;


import com.lgj.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ApiController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/info")
    public String info(){
        log.info("访问/info");
        String result = consumerService.info();
        log.info("result={}",result);
        return result;
    }

}
