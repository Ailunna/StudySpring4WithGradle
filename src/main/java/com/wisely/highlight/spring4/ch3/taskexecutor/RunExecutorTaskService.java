package com.wisely.highlight.spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunExecutorTaskService {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cts = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService aTaskService = cts.getBean(AsyncTaskService.class);
		for(int i = 0;i<10;i++) {
			aTaskService.executeAsynTask(i);
			aTaskService.executeAsyncTaskPlus(i);
		}
		
		cts.close();
		

	}

}
