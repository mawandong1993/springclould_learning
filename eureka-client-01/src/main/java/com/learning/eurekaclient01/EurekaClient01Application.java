package com.learning.eurekaclient01;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2Doc
public class EurekaClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient01Application.class, args);
    }
}
