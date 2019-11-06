package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册中心
 * **/
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudNetflixRegisteringWithEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNetflixRegisteringWithEurekaApplication.class, args);
    }

}
