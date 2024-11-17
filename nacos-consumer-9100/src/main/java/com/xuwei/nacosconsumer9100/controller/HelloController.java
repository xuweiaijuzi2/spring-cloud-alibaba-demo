package com.xuwei.nacosconsumer9100.controller;

import com.xuwei.nacosconsumer9100.feign.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    @Autowired
    private NacosProviderService nacosProviderService;
    @Value("${config.info}")
    private String configInfo;
    @GetMapping("hello")
    public String hello(){
        System.out.println("------nacos-provider-9100 is running------");
        System.out.println("this is configInfo from remote config center: "+configInfo);
        return nacosProviderService.hello();
    }
}
