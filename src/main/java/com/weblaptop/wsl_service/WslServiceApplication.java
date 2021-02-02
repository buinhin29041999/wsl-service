package com.weblaptop.wsl_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class WslServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WslServiceApplication.class, args);
    }

}
