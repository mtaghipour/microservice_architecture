package com.mt.microservice.microservice_architecture.liceneses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* Tells the SpringBoot that this class is the source of bean definitions
* This is the bootstrap class for entire microservice
* Core initialization logic for the service should be placed in here
* */
@SpringBootApplication
public class MicroserviceArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceArchitectureApplication.class, args);
    }

}
