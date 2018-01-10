package com.wisely.highlight.spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.wisely.highlight.spring4.ch3.conditional")
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListServie() {
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxListService(){
		return new LinuxListService();
	}

}
