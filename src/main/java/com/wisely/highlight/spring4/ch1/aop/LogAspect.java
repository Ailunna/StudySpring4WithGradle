package com.wisely.highlight.spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(com.wisely.highlight.spring4.ch1.aop.Action)")
	public void annotationPointCut() {};
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature singnature = (MethodSignature) joinPoint.getSignature();
		Method method = singnature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截"+action.name());
	}
	
	//这里的*和com之间一定要有一个空格, 否则有问题, 运行出异常.
	@Before("execution(* com.wisely.highlight.spring4.ch1.aop.DemoMethodService*.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截"+method.getName());
	}
	
	
}
