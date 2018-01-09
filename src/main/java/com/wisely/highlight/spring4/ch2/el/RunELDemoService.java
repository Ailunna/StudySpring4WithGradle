package com.wisely.highlight.spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunELDemoService {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
		ELConfig resourceServices = context.getBean(ELConfig.class);
		resourceServices.outputResource();
		context.close();

	}

}
