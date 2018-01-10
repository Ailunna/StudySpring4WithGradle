package com.wisely.highlight.spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("report for each 5 seconds:"+dateFormat.format(new Date()));
	}
	
	@Scheduled(cron="0 28 11 ? * *")
	public void fixTimeExecution() {
		System.out.println("At specific time: run :"+dateFormat.format(new Date())+"lanuch.");
	}
	
	@Bean
		public TaskScheduler taskScheduler() {
		   return new ConcurrentTaskScheduler(); //single threaded by default
		}
}
