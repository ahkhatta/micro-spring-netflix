package com.ahmed.micro.mock.service1;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: Ahmed Khattab (https://github.com/ahkhatta)
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Service1Application {

    public static void main(String[] args) {

        ApplicationContext ctx = 
          SpringApplication.run(Service1Application.class, args);

        System.out.println("Hello, Spring Cloud Project! (Service1)");

        System.out.println("List of beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
