package com.altinsoy.restcallrickandmorty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestCallRickAndMorty {

    public static void main(String[] args) {
        SpringApplication.run(RestCallRickAndMorty.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();}

    @Bean
    public HttpHeaders httpHeaders(){
        return new HttpHeaders();
    }
}
