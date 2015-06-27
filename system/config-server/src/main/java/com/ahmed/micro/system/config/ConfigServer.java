package com.ahmed.micro.system.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Author: Ahmed Khattab (https://github.com/ahkhatta)
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

    public static void main(String[] args) {

        SpringApplication.run(ConfigServer.class, args);
    }
}
