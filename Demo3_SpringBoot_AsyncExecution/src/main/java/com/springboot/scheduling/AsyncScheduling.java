package com.springboot.scheduling;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@EnableAsync //To enable Async
public class AsyncScheduling 
{
	@Scheduled(fixedRate = 3000, initialDelay = 10000)
	@Async
	public void schedule() throws InterruptedException {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String current = localDateTime.format(dateTimeFormatter);
		log.info("Started " + Thread.currentThread());
		log.info("Scheduled Time: " + Thread.currentThread() + "--->" + current);
		Thread.sleep(5000);
		log.info("Finished " + Thread.currentThread());
	}
}
