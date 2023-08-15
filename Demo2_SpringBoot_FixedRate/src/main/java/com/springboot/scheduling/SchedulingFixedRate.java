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
@EnableAsync
public class SchedulingFixedRate 
{
	@Scheduled(fixedRate = 3000, initialDelay = 10000)
	/*
	 * fixedRate 	=> Next execution won't wait till the time the previous one is not completed
	 * */
	@Async
	public void schedule() throws InterruptedException {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String current = localDateTime.format(dateTimeFormatter);
		log.info("Scheduled Time: " + current);
		log.info("Started");
		Thread.sleep(5000);
		log.info("Finished");
	}
}