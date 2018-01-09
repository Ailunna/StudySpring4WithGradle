package com.wisely.highlight.spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSpring4ProfileSampleService {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(ProfileConfig.class);
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean.getContent());
		context.close();
	}

}
