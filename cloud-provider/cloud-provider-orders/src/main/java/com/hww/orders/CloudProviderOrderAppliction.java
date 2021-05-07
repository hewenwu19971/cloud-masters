package com.hww.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderOrderAppliction {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderOrderAppliction.class, args);
    }
}
