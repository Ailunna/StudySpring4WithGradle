package com.wisely.highlight.spring4.ch1.javaconfig;

public class FunctionService {
	public String sayHello(String word) {
		return "Hello without injection, by javaconfig "+word+" !";
	}
}
