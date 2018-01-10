package com.wisely.highlight.spring4.ch3.taskscheduler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

@Configuration
@ComponentScan("com.wisely.highlight.spring4.ch3.taskscheduler")
@EnableScheduling
public class TaskScheduledConfig {
	//@Bean
	//public TaskScheduler taskScheduler() {
	 //   return new ConcurrentTaskScheduler(); //single threaded by default
	//}
}
