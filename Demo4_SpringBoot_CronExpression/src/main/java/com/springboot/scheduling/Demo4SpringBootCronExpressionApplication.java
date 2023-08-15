package com.springboot.scheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Demo4SpringBootCronExpressionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo4SpringBootCronExpressionApplication.class, args);
	}

}
