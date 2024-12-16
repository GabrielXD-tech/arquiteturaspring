package com.example.produtosapi.controller.arquiteturaspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootTest;

@SpringBootTest
public class ArquiteturaspringApplicationTests {

	public static void main(String[] args) {
		//SpringApplication.run(Aplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicatonBuilder(Application.class);

		builder.run(args);
		}
}
