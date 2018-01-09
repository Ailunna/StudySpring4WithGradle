package com.wisely.highlight.spring4.ch2.prepost;

import org.springframework.stereotype.Service;

public class BeanWayService {

	public void init() {
		System.out.println("@Bean-init-method");
	}
	public BeanWayService() {
		super();
		System.out.println("初始化构建-Bean-init-method");
	}
	public void destroy() {
		System.out.println("@Bean-destroy-method");
	}
}
