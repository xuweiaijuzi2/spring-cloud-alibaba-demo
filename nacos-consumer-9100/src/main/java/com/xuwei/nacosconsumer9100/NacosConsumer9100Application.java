package com.xuwei.nacosconsumer9100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumer9100Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer9100Application.class, args);
    }

}
