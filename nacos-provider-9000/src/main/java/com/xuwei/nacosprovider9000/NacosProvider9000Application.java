package com.xuwei.nacosprovider9000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvider9000Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9000Application.class, args);
    }

}
