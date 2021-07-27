package com.example.Springjdbc2.service;


import lombok.Data;

@Data

//@Service// service has component hene it automatically creates the service Bean for us
public class DummyService {

    // @Value("${service.name: 'harini's Service'}")
    private String serviceName;

    public DummyService(String serviceName) { //constructor
        this.serviceName = serviceName;
    }

    public String getServiceName(){
        return serviceName;
    }

}