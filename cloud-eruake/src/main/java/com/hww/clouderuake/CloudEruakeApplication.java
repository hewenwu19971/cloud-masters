package com.hww.clouderuake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEruakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEruakeApplication.class, args);
    }

}
