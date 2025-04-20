package com.learning.eurekaclient02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient02Application.class, args);
    }
}
