package com.wisely.highlight.spring4.ch3.portfolio.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunPortfolioAnnotationDemoService {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService demoService = ctx.getBean(DemoService.class);
		demoService.outputResult();
		ctx.close();
	}

}
