package com.wisely.highlight.spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware{

	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resLoader) {
		this.loader = resLoader;
		
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;	
	}
	
	public void outputResult() {
		System.out.println("Bean's name is:"+beanName);
		Resource resource = loader.getResource("classpath:com/wisely/highlight/spring4/ch3/aware/test.txt");
		try {
			System.out.println("ResourceLoader loaded file content is: "+IOUtils.toString(resource.getInputStream()));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
