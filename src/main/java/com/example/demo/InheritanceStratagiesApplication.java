package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritanceStratagiesApplication implements CommandLineRunner {

	
	@Autowired
	SampleService service;
	public static void main(String[] args) {
		SpringApplication.run(InheritanceStratagiesApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
              service.createPerson();	
              service.createAnimal();
              service.CreateVehicle();
	}
}
