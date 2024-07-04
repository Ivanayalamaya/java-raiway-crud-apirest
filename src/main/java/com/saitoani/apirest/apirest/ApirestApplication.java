package com.saitoani.apirest.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


//decoracion de springboot
@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		//asi se corrre una aplicacion spring dentro de java
		SpringApplication.run(ApirestApplication.class, args);
	}

	

}
