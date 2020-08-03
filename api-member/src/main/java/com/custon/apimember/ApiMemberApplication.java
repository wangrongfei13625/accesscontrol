package com.custon.apimember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiMemberApplication.class, args);
    }

}
