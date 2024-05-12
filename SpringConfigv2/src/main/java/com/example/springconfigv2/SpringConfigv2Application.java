package com.example.springconfigv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigv2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigv2Application.class, args);
    }

}
