package com.javainterviewpoint;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/")
    String hello() {
        return "Hello Dear World! JavaInterviewPoint";
    }

}