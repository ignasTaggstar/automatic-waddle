package com.vilius.myfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Pakeisk i automatini konfiguravima
@SpringBootApplication
/**
@Configuration
@EnableAutoConfiguration
*/
public class MyfirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstApplication.class, args);
	}
}
