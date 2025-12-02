package com.cibertec.clase4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Clase4Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase4Application.class, args);
	}

}
