package com.wisely.highlight.spring4.ch2.profile;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class WebInit implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext container) throws ServletException {

		container.setInitParameter("spring.profiles.default", "dev");
	}

}
