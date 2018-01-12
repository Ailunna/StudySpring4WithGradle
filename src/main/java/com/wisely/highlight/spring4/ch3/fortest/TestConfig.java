//package com.wisely.highlight.spring4.ch3.fortest;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//@Configuration
//@ComponentScan("com.wisely.highlight.spring4.ch3.fortest")
//public class TestConfig {
//
//	@Bean
//	@Profile("dev")
//	public TestBean devTestBean() {
//		return new TestBean("from dev profile");
//	}
//	
//	@Bean
//	@Profile("prod")
//	public TestBean prodTestBean() {
//		return new TestBean("from prod profile");
//	}
//}
