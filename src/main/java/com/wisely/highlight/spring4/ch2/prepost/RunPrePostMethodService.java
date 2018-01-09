package com.wisely.highlight.spring4.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunPrePostMethodService {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		context.getBean(BeanWayService.class);
		context.getBean(JSR250WayService.class);
		
		context.close();

	}

}
