package com.ahmed.micro.system.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: Ahmed Khattab (https://github.com/ahkhatta)
 */

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class DiscoveryServer {

    public static void main(String[] args) {

        SpringApplication.run(DiscoveryServer.class, args);

    }
}
