package com.ahmed.micro.mock.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: Ahmed Khattab (https://github.com/ahkhatta)
 */

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient.class, args);
    }
}
