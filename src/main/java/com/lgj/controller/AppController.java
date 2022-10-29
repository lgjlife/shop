package com.lgj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class AppController {

    @RequestMapping("/info")
    public String info(){

        System.out.println("info...");
        return "info" + new Random().nextInt(100);
    }
}
