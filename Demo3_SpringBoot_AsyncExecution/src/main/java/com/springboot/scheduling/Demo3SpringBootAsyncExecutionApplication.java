package com.springboot.scheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Demo3SpringBootAsyncExecutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo3SpringBootAsyncExecutionApplication.class, args);
	}

}
