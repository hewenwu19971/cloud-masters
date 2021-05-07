package com.hww.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatwayAppliction {
    public static void main(String[] args) {
        SpringApplication.run(CloudGatwayAppliction.class,args);
    }
}
