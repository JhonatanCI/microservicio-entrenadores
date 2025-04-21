package com.icesi.microservicio_entrenador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicioEntrenadoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioEntrenadoresApplication.class, args);
	}

}
