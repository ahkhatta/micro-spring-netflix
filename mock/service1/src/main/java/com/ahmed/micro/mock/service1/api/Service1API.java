package com.ahmed.micro.mock.service1.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Ahmed Khattab (https://github.com/ahkhatta)
 */

@RestController
public class Service1API {

    @RequestMapping("/s1")
    public String sayHi() {
      return "Hi from Service 1 API\n";
    }
}
