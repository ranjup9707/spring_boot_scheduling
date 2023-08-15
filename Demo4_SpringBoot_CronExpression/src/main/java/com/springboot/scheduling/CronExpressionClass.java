package com.springboot.scheduling;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CronExpressionClass 
{
	@Scheduled(cron = "*/2 * * * * *") //Every 2 seconds
	public void scheduling() {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String current = dateFormatter.format(localDateTime);
		log.info("Current Date Time : " + current);
	}

}
