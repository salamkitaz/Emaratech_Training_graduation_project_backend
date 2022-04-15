package com.example.angularshopbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AngularshopBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngularshopBackendApplication.class, args);
    }

    //to allow frontend calls to rest api
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/register").allowedOrigins("http://localhost:8080").allowedOrigins("http://localhost:4200");
                registry.addMapping("/login").allowedOrigins("http://localhost:8080").allowedOrigins("http://localhost:4200");

            }
        };
    }
}
