package com.wisely.highlight.spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ComponentScan("com.wisely.highlight.spring4.ch2.profile")
public class ProfileConfig {

	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("from devlopment profile");		
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean() {
		return new DemoBean("from prod profile");		
	}
	
}
