package com.example.springbootapidocswagger;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Api(value = "My Pet API Documentation")
public class SpringbootApiDocSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApiDocSwaggerApplication.class, args);
    }

}
