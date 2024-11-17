package com.xuwei.nacosconsumer9100.feign;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "naocs-provider")
public interface NacosProviderService {

    @GetMapping("hello")
    @LoadBalanced
    public String hello();
}
