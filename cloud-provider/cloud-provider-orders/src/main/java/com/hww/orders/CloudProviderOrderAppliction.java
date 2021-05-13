package com.hww.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages ="com.hww.orders.service")
public class CloudProviderOrderAppliction {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderOrderAppliction.class, args);
    }
}
