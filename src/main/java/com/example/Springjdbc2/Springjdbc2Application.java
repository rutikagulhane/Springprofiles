package com.example.Springjdbc2;

import com.example.Springjdbc2.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class Springjdbc2Application {


@Autowired // this is for setter base injection
	private DummyService service;// if we do not want to use setter method we can create constructor


//	public Springjdbc2Application(DummyService dummyService) {
//		this.dummyService = dummyService;
//	}

//		@Bean
//		CommandLineRunner runner()
//	{
//		return args -> {
//			System.out.println(service.getServiceName());
//		};
//	}

@Bean
CommandLineRunner runner(){
	return  arg ->{
		System.out.println(service.getServiceName());
		//footBall.play();
		//game.play();
	};
}
	public static void main(String[] args) {
		SpringApplication.run(Springjdbc2Application.class, args);

	}

}
