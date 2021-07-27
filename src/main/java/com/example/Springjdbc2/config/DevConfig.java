package com.example.Springjdbc2.config;

import com.example.Springjdbc2.service.DummyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class DevConfig {

    @Value("${service.name}")
    private String serviceName;


    @Bean
    public DummyService dummyService(){
        return new DummyService(serviceName);
    }

}