package com.wisely.highlight.spring4.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunScheduledService {

	/**
	 * ����ʱ�ᱨһ���쳣- No qualifying bean of type 'org.springframework.scheduling.TaskScheduler' available
	 * ������debug�����, ԭ������:
	 * ԭ����Spring�Ķ�ʱ����������᳢�Ի�ȡһ��ע����� task scheduler����������ȣ����᳢��ͨ��BeanFactory.getBean�ķ�������ȡһ��ע�����scheduler bean����ȡ�Ĳ������£�
		1.���Դ��������ҵ�һ��TaskScheduler Bean
		2.Ѱ��ScheduledExecutorService Bean
		3.ʹ��Ĭ�ϵ�scheduler
		ǰ����������Ҳ����Ļ����ͻ���debug�ķ�ʽ�׳��쳣���ֱ��ǣ�
		logger.debug("Could not find default TaskScheduler bean", ex);
		logger.debug("Could not find default ScheduledExecutorService bean", ex);
		���ԣ���־�д�ӡ�����������쳣����������ʲô������Ϣ��Ҳ����Ӱ�춨ʱ����ʹ�ã�ֻ������spring���Լ���ӡ��һЩ��Ϣ���ˣ�����û�����ף�Ϊʲô��Ҫ���쳣�ķ�ʽ�������������Ϊ�˿���������ɡ�Ҳ���ߣ���������һЩ��Ҫ����Ϣ��Ҫ��ʾ�����ߡ�������ʲôԭ��ֻ���л����һ����ȥ�˽��ˡ�
		�������:��ScheduledTaskService�����һ��bean-taskScheduler.
	 * */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TaskScheduledConfig.class);
		
		//��������ctx.close(), ��ôӦ�ó����ִ����һ�ξ��˳�.
		
	}

}
