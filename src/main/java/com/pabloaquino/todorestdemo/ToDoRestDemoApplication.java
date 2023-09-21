package com.pabloaquino.todorestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ToDoRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoRestDemoApplication.class, args);
	}

}
