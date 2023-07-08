package com.example.orderfoodapi;

import com.example.orderfoodapi.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class OrderFoodApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderFoodApiApplication.class, args);
    }

}
