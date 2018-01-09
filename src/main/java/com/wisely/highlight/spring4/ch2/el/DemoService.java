package com.wisely.highlight.spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Value("Other properties")
	private String another;
	
	public String getAnother() {
		return this.another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
}
