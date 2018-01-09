package com.wisely.highlight.spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunScopeTestService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		SingletonService s1 = context.getBean(SingletonService.class);
		SingletonService s2 = context.getBean(SingletonService.class);
		
		PrototypeService ps1 = context.getBean(PrototypeService.class);
		PrototypeService ps2 = context.getBean(PrototypeService.class);
		
		System.out.println("s1 == s2"+(s1 == s2));
		System.out.println("ps1 == ps2"+(ps1 == ps2));
		context.close();
	}

}
