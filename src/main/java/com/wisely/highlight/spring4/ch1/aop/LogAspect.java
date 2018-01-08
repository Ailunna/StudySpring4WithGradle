package com.wisely.highlight.spring4.ch1.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(com.wisely.highlight.spring4.ch1.aop.Action)")
	public void annotationPointCut() {};
	
	
}
