package com.example.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceApplication {

    //Using RestTemplate
    //public RestTemplate restTemplate(){
    //return new RestTemplate();
    //}

    //Using WebClient
    // @Bean
    // public WebClient webClient(){
    //  return WebClient.builder().build();
    // }


    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

}
