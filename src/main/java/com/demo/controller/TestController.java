package com.demo.controller;


import com.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("a")
    public  String test() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Date()+"   "+ testService.cacheFunction(i))   ;
        }
        return "sussce";
    }
}
