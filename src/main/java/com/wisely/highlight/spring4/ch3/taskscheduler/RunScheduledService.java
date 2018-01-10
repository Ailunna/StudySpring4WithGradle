package com.wisely.highlight.spring4.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunScheduledService {

	/**
	 * 运行时会报一个异常- No qualifying bean of type 'org.springframework.scheduling.TaskScheduler' available
	 * 但是是debug级别的, 原因如下:
	 * 原来，Spring的定时任务调度器会尝试获取一个注册过的 task scheduler来做任务调度，它会尝试通过BeanFactory.getBean的方法来获取一个注册过的scheduler bean，获取的步骤如下：
		1.尝试从配置中找到一个TaskScheduler Bean
		2.寻找ScheduledExecutorService Bean
		3.使用默认的scheduler
		前两步，如果找不到的话，就会以debug的方式抛出异常，分别是：
		logger.debug("Could not find default TaskScheduler bean", ex);
		logger.debug("Could not find default ScheduledExecutorService bean", ex);
		所以，日志中打印出来的两个异常，根本不是什么错误信息，也不会影响定时器的使用，只不过是spring的自己打印的一些信息罢了，不过没搞明白，为什么非要用异常的方式打出来，估计是为了看这清晰点吧。也或者，这里面有一些重要的信息需要提示开发者。具体是什么原因，只能有机会进一步再去了解了。
		解决方法:在ScheduledTaskService里加入一个bean-taskScheduler.
	 * */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TaskScheduledConfig.class);
		
		//这里如里ctx.close(), 那么应用程序会执行完一次就退出.
		
	}

}
