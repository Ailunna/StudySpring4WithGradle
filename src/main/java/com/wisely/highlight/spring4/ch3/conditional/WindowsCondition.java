package com.wisely.highlight.spring4.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition{

	@Override
	public boolean matches(ConditionContext ctx, AnnotatedTypeMetadata metadata) {
		
		return ctx.getEnvironment().getProperty("os.name").contains("Windows");
	}

}
