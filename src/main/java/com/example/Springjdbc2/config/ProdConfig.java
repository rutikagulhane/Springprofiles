package com.example.Springjdbc2.config;

import com.example.Springjdbc2.service.DummyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {

    @Value("${service.name}")
    private String serviceName;

    //    public ProdutionConfig(String serviceName) {
//        this.serviceName = serviceName;
//    }
    @Bean
    public DummyService dummyService(){
        return new DummyService(serviceName);
    }

}