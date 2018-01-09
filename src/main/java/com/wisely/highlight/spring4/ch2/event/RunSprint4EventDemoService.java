package com.wisely.highlight.spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSprint4EventDemoService {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		demoPublisher.publish("Yanqiu sent the message for testing event sample of Spring4");
		context.close();

	}

}
