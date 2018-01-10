package com.wisely.highlight.spring4.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunConditionalDemoService {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService listService = ctx.getBean(ListService.class);
		System.out.println(ctx.getEnvironment().getProperty("os.name")+" system command list as :"+listService.showListCmd());
		
	}

}
