package com.springboot.scheduling;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SchedulingFixedDelay 
{
	@Scheduled(fixedDelay = 1000, initialDelay = 10000)
	/*
	 * initialDelay	=> First execution starts after 10 sec
	 * fixedDelay 	=> There is a fixed delay between each execution
	 * 				   Next execution will wait till the time the previous one is not completed
	 * */
	public void scheduling() throws InterruptedException {
		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = currentTime.format(dateTimeFormat);
		log.info("Scheduled Time: " + formattedDateTime);
		Thread.sleep(3000);
	}
}
