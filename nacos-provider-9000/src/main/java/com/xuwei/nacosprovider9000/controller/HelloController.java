package com.xuwei.nacosprovider9000.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${config.info}")
    private String configInfo;
    @GetMapping("hello")
    public String hello(){
        System.out.println("------nacos-provider-9000 is running------");
        System.out.println("this is configInfo from remote config center: "+configInfo);
        return "this is nacos-provider-9000 back";
    }
}
