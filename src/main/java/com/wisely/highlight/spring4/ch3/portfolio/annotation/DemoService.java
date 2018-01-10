package com.wisely.highlight.spring4.ch3.portfolio.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void outputResult() {
		System.out.println("take a bean from porfolio annotation.");
	}
}
