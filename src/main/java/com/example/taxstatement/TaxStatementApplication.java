package com.example.taxstatement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TaxStatementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxStatementApplication.class, args);
	}

}
