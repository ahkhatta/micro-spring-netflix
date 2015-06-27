package com.ahmed.micro.system.edge;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Author: Ahmed Khattab (https://github.com/ahkhatta)
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
@EnableZuulProxy
public class EdgeServer {
	
    public static void main(String[] args) {
        new SpringApplicationBuilder(EdgeServer.class).web(true).run(args);
    }

}
